package moe.kurenai.multitenancy.annotation

import org.springframework.boot.autoconfigure.condition.ConditionOutcome
import org.springframework.boot.autoconfigure.condition.SpringBootCondition
import org.springframework.context.annotation.ConditionContext
import org.springframework.core.annotation.MergedAnnotation
import org.springframework.core.annotation.MergedAnnotationPredicates
import org.springframework.core.type.AnnotatedTypeMetadata

class OnDBConfiguration: SpringBootCondition() {

    override fun getMatchOutcome(
        context: ConditionContext,
        metadata: AnnotatedTypeMetadata
    ): ConditionOutcome {
        val allAnnotationAttributes = metadata.annotations
            .stream<ConditionalOnDBConfiguration>(ConditionalOnDBConfiguration::class.java.name)
            .filter(MergedAnnotationPredicates.unique(MergedAnnotation::getType))
            .map(MergedAnnotation::asAnnotationAttributes)
            .toList()


        TODO("Not yet implemented")
    }
}