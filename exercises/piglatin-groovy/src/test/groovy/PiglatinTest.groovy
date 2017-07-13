import spock.lang.Shared
import spock.lang.Specification

class PiglatinTest extends Specification {

    @Shared
    def piglatin = new Piglatin()

    def "word starts with a vowel"() {
        when:
        def result = piglatin.translate('apple')

        then:
        result == 'appleyay'
    }

    def "word starts with a vowel uppercase"() {
        when:
        def result = piglatin.translate('Apple')

        then:
        result == 'Appleyay'
    }

    def "word starts with one consonent"() {

        when:
        def result = piglatin.translate('game')

        then:
        result == 'amegyay'
    }

    def "word starts with one consonent uppercase"() {

        when:
        def result = piglatin.translate('Game')

        then:
        result == 'Amegyay'
    }

    def "word starts with multiple consonents"() {

        when:
        def result = piglatin.translate('break')

        then:
        result == 'eakbryay'
    }

    def "full sentence"() {

        when:
        def result = piglatin.translate('The narrator meets this little guy in the Sahara, far, far away from all human habitation. The narrator, who is a pilot, has had an accident with his plane and has been forced to land in the desert. The little prince, he discovers, is visiting from another planet.')

        then:
        result == 'Ethyay arratornyay eetsmyay isthyay ittlelyay uygyay inyay ethyay Aharasyay, arfyay, arfyay awayyay omfryay allyay umanhyay abitationhyay. Ethyay arratornyay, owhyay isyay ayay ilotpyay, ashyay adhyay anyay accidentyay ithwyay ishyay aneplyay andyay ashyay eenbyay orcedfyay otyay andlyay inyay ethyay esertdyay. Ethyay ittlelyay incepryay, ehyay iscoversdyay, isyay isitingvyay omfryay anotheryay anetplyay.'
    }
}
