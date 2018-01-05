MyBatis 项目结构：
    annotation
        info: contains all annotations
    binding
        info: binding mapped statement
    builder
        annotation
            info: annotations Configuration
        xml
            info: xml Configuration
        info: for the configuration build code
    cache
        decorators
            info: cache decorators
        impl
            info: default cache implementation
        info: cache staff
    cursor
        defaults
            info: default implementation
        info: cursor feature
    datasource
        jndi
            info: JNDI datasource
        pooled
            info: simple single thread pooled datasource
        unpooled
            info: hyper simple datasource
        info: datasource
    exception
        info: base exceptions
    executor
        keygen
            info: key generator
        loader
            cglib
                info: CGLIB proxy factory
            javassist
                info: javassist proxy factory
            info: loading results into beans
        parameter
            info: handle the parameter
        result
            info: result handler
        resultset
            info: result processing logic
        statement
            info: statement handlers
        info: contains statement executors
    io
        info: utilities to read resource
    jdbc
        info: empty?
    lang
        info: Java environment configuration
    logging
        commons
        jdbc
        jdk14
        log4j
        log4j2
        nologging
        slf4j
        stdout
        info: logger
    mapping
        info: mapping
    parsing
        info: parsing utils
    plugin
        info: handle plugins
    reflection
        factory
            info: object factory
        invoker
            info: unused
        property
            info: tools for getter/setter
        wrapper
            info: object wrapper
        info: reflection utils
    scripting
        defaults
            info: default beans for language
        xmltags
            info: default xml mybatis language
        info: base package for languages
    session
        default
            info: default sqlSession implements
        info: contains sqlSession
    transaction
        jdbc
            info: jdbc transactions
        managed
            info: external transactions
        info: base package for transaction
    type
        info: type handler
    