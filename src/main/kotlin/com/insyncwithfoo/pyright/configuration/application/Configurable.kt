package com.insyncwithfoo.pyright.configuration.application

import com.insyncwithfoo.pyright.configuration.common.PyrightConfigurable
import com.insyncwithfoo.pyright.message
import com.intellij.util.xmlb.XmlSerializerUtil


internal class PyrightApplicationConfigurable : PyrightConfigurable<Configurations>() {
    
    override val service = ConfigurationService.getInstance()
    override val panel by lazy { ConfigurationPanel() }
    
    override val originalConfigurations: Configurations =
        XmlSerializerUtil.createCopy(service.configurations)
    
    override fun getDisplayName() = message("configurations.global.displayName")
    
}
