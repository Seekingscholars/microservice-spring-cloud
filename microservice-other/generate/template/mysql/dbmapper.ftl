<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<!-- ${tableName}表:${functionName}模块 -->
<mapper namespace="${mapperName}.${ClassName}Mapper">
    <!--返回Map-->
    <resultMap id="BaseResultMap" type="${packageName}.${ClassName}">
    <#list list as column>
        <#if column.columnName == "id">
            <id column="${column.typeName}" property="${column.columnName}" jdbcType="${column.jdbcType}" />
        <#else >
            <result column="${column.typeName}" property="${column.columnName}" jdbcType="${column.jdbcType}" />
        </#if>
    </#list>
    </resultMap>

    <!--基本的sql查询字段 公共引用...-->
    <sql id="Base_Column_List">
    <#list list as column>${column.typeName}<#if column_index+1 != listSize>,<#else> </#if></#list>
    </sql>

    <!-- 基本的sql查询条件公共引用 -->
    <sql id="searchBy">
        <trim prefix="where" prefixOverrides="and|or">
        <#list list as column>
        <#if column.columnName == "id">
            <if test=" id != null and id != '' ">
                id  = #${leftBraces}id,jdbcType=${column.jdbcType}${rightBraces}
            </if>
        <#elseif column.dataType == "Date">
            <if test="${column.columnName} != null">
                and ${column.typeName} = #${leftBraces}${column.columnName},jdbcType=${column.jdbcType}${rightBraces}
            </if>
        <#elseif column.dataType == "Double">
            <if test="${column.columnName} != null">
                and ${column.typeName} = #${leftBraces}${column.columnName},jdbcType=${column.jdbcType}${rightBraces}
            </if>
        <#elseif column.dataType == "Integer">
            <if test="${column.columnName} != null">
                and ${column.typeName} = #${leftBraces}${column.columnName},jdbcType=${column.jdbcType}${rightBraces}
            </if>
        <#elseif column.dataType == "Long">
            <if test="${column.columnName} != null">
                and ${column.typeName} = #${leftBraces}${column.columnName},jdbcType=${column.jdbcType}${rightBraces}
            </if>
        <#else >
            <if test="${column.columnName} != null and ${column.columnName} != '' ">
                and ${column.typeName} = #${leftBraces}${column.columnName},jdbcType=${column.jdbcType}${rightBraces}
            </if>
        </#if >
        </#list>
        </trim>
    </sql>

    <!-- 全量保存数据 -->
    <insert id="save" parameterType="${packageName}.${ClassName}">
        insert into ${tableName}(<#list list as column><#if column.columnName == "id"><#else>${column.typeName}<#if column_index+1 != listSize>,<#else></#if></#if></#list>)
        values(<#list list as column><#if column.columnName == "id"><#else >#${leftBraces}${column.columnName},jdbcType=${column.jdbcType}${rightBraces}<#if column_index+1 != listSize>,<#else></#if></#if ></#list>)
    </insert>

    <!-- 更新数据 -->
    <update id="updateSelective"  parameterType="java.util.HashMap">
        update ${tableName}
        <set>
        <#list list as column>
        <#if column.columnName == "id">
        <#elseif column.dataType == "Date">
            <if test="${column.columnName} != null">${column.typeName} = #${leftBraces}${column.columnName},jdbcType=${column.jdbcType}${rightBraces}<#if column_index+1 != listSize>,<#else></#if></if>
        <#elseif column.dataType == "Double">
            <if test="${column.columnName} != null">${column.typeName} = #${leftBraces}${column.columnName},jdbcType=${column.jdbcType}${rightBraces}<#if column_index+1 != listSize>,<#else></#if></if>
        <#elseif column.dataType == "Integer">
            <if test="${column.columnName} != null">${column.typeName} = #${leftBraces}${column.columnName},jdbcType=${column.jdbcType}${rightBraces}<#if column_index+1 != listSize>,<#else></#if></if>
        <#elseif column.dataType == "Long">
            <if test="${column.columnName} != null">${column.typeName} = #${leftBraces}${column.columnName},jdbcType=${column.jdbcType}${rightBraces}<#if column_index+1 != listSize>,<#else></#if></if>
        <#else >
            <if test="${column.columnName} != null and ${column.columnName} != '' ">${column.typeName} = #${leftBraces}${column.columnName},jdbcType=${column.jdbcType}${rightBraces}<#if column_index+1 != listSize>,<#else></#if></if>
        </#if >
        </#list>
        </set>
        where id = #${leftBraces}id ,jdbcType=INTEGER${rightBraces}
    </update>

    <!-- 查询唯一 -->
    <select id="findByPrimary" resultMap="BaseResultMap" parameterType="java.lang.Long">
        select
        <include refid="Base_Column_List" />
        from ${tableName}
        where id = #${leftBraces}id,jdbcType=INTEGER${rightBraces}
    </select>

    <!-- 模糊匹配 -->
    <select id="findSelective" resultMap="BaseResultMap" parameterType="java.util.HashMap">
        select
        <include refid="Base_Column_List" />
        from ${tableName}
        <include refid="searchBy"/>
    </select>

    <!-- 一般应用分页 -->
    <select id="listSelective" resultMap="BaseResultMap" parameterType="java.util.HashMap">
        select
        <include refid="Base_Column_List" />
        from ${tableName}
        <include refid="searchBy"/>
    </select>

</mapper>
