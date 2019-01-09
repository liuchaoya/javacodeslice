package com.liucy.leetcode.困难;

import java.util.ArrayList;
import java.util.List;

public class SubstringWithConcatenationOfAllWords {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // [0, 9]
        String s = "barfoothefoobarman";
        String[] words = new String[] { "foo", "bar" };

        // [8]
//        String s = "wordgoodgoodgoodbestword";
//        String[] words = new String[] { "word", "good", "best", "good" };

        // [13]
//        String s = "lingmindraboofooowingdingbarrwingmonkeypoundcake";
//        String[] words = new String[] { "fooo", "barr", "wing", "ding", "wing" };

        // [373]
//        String s = "ejwwmybnorgshugzmoxopwuvshlcwasclobxmckcvtxfndeztdqiakfusswqsovdfwatanwxgtctyjvsmlcoxijrahivwfybbbudosawnfpmomgczirzscqvlaqhfqkithlhbodptvdhjljltckogcjsdbbktotnxgwyuapnxuwgfirbmdrvgapldsvwgqjfxggtixjhshnzphcemtzsvodygbxpriwqockyavfscvtsewyqpxlnnqnvrkmjtjbjllilinflkbfoxdhocsbpirmcbznuioevcojkdqvoraeqdlhffkwqbjsdkfxstdpxryixrdligpzldgtiqryuasxmxwgtcwsvwasngdwovxzafuixmjrobqbbnhwpdokcpfpxinlfmkfrfqrtzkhabidqszhxorzfypcjcnopzwigmbznmjnpttflsmjifknezrneedvgzfmnhoavxqksjreddpmibbodtbhzfehgluuukupjmbbvshzxyniaowdjamlfssndojyyephstlonsplrettspwepipwcjmfyvfybxiuqtkdlzqedjxxbvdsfurhedneauccrkyjfiptjfxmpxlssrkyldfriuvjranikluqtjjcoiqffdxaukagphzycvjtvwdhhxzagkevvuccxccuoccdkbboymjtimdrmerspxpktsmrwrlkvpnhqrvpdekmtpdfuxzjwpvqjjhfaupylefbvbsbhdncsshmrhxoyuejenqgjheulkxjnqkwvzznriclrbzryfaeuqkfxrbldyusoeoldpbwadhrgijeplijcvqbormrqglgmzsprtmryvkeevlthvflsvognbxfjilwkdndyzwwxgdbeqwlldyezmkopktzugxgkklimhhjqkmuaifnodtpredhqygmedtqpezboimeuyyujfjxkdmbjpizpqltvgknnlodtbhnbhjkmuhwxvzgmkhbcvvadhnssbvneecglnqxhavhvxpkjxlluilzpysjcnwguyofnhfvhaceztoiscumkhociglkvispihvyoatxcxbeqsmluixgsliatukrecgoldmzfhwkgaqzsckonjuhxdhqztjfxstjvikdrhpyjfxbjjryslfpqoiphrwfjqqhaamrjbrsiovrxmqsyxhqmritjeauwqbwtpqcqhvyyssvfknfhxvtodpzipueixdbntdfcaeatyyainfpkclbgaaqrwwzwbcjwiqzkwzfuxfclmsxpdyvfbnwxjytnaejivivriamhgqsskqhnqeurttrfrmstrbeokzhuzvbfmwywohmgogyhzpmsdemugqkspsmoppwbnwabdmiruibwznqcuczculujfiavzwynsyqxmarjkshjhxobandwyzggjibjgzyaaqxorqxbkenscbveqbaociwmqxxyzvyblypeongzrttvwqzmrccwkzidyfbxcaypyquodcpwxkstbthuvjqgialhfmgjohzoxvdaxuywfqrgmyahhtpqtazbphmfoluliznftodyguesshcacrsvutylalqrykehjuofisdookjhrljvedsywrlyccpaowjaqyfaqioesxnlkwgpbznzszyudpwrlgrdgwdyhucztsneqttsuirmjriohhgunzatyfrfzvgvptbgpwajgtysligupoqeoqxoyqtzozufvvlktnvahvsseymtpeyfvxttqosgpplkmxwgmsgtpantazppgnubmpwcdqkvhwfuvcahwibniohiqyywnuzzmxeppokxksrfwrpuzqhjgqryorwboxdauhrkxehiwaputeouwxdfoudcoagcxjcuqvenznxxnprgvhasffxtzaxpcfrcovwgrcwqptoekhmgpoywtxruxokcubekzcrqengviwbtgnzvdzrwwkqvacxwgdhffyvjldgvchoiwnfzoyvkiogisdfyjmfomcazigukqlumyzmnzjzhzfpslwsukykwckvktswjdqxdrlsqvsxwxpqkljeyjpulbswwmuhplfueqnvnhukgjarxlxvwmriqjgmxawmndhsvwnjdjvjtxcsjapfogpesxtpypenunfpjuyoevzztctecilqqbxkaqcyhiobvtqgqruumvvhxolbyzsqcrdchhdqprtkkjsccowrjtyjjmkhleanvfpemuublnnyzfabtxsestncfalqenfcswgerbfcqsapzdtscnzugmwlmidtxkvqhbuaecevwhmwkfqmvpgbefpqpsjmdecmixmmbsjxzwvjdmxydechlraajjmoqpcyoqmrjwoiumuzatydzcnktnkeyztoqvogodxxznhvzduzxudwwqhpftwdspuimioanlzobhjakgajafgzxpqckmhdbbnqmcszpuoqbztnftzgahhxwxbgkilnmzfydyxusnnvngksbjabqjaohdvrniezhmxmkxhemwbbclwdxwgngicplzgajmaryzfkyoqlkrmmfirchzrphveuwmvgaxzbwenvteifxuuefnimnadwxhruvoavlzyhfmeasmgrjawongccgfbgoualiaivbhcgvjjnxpggrewglalthmzvgziobrjeanlvyukwlscexbkibvdjhdgnepdiimmkcxhattwglbkicvsfswocbvphmtpwhcgjbnmxgidtlqcnnwtfujhvgzdussqbwynylzvtjapvqtidpdjkpshvrmqlhindhabubyokzdfrwqvnvgzkyhistydagsgnujiviyijdnabfxqbdqnexvwsvzvcsbrmkbkuzsdehghndyqjodnnblfwmaygdstotfkvxozgwhtbhlkvrzismnozqpfthajafuxekzlgigjpsukjvsdihrjzgovnreqwapdkoqswyclqyvbvpedzyoyedvuuamscbxnqnfmmjyehvidnoimmxmtcinwkbqmcobubjjpshucechrqrffqsyscnqoohcsxenypyqhfklloudgmklcejvgynwouzhtfwuuukdbwpmkjrqxeeaipxrokncholathupdetgaktmvmftqjvzyssocftjwemroghrncynmtchhhcaqxbqpthuaafwgrouaxonzocljeuslzsdwvuoodipdpnlhdihaywzmymxdjrqikughquwtenyucjdgrmipiidiwclhuepgyynoslhzahtdqwliktzsddaahohbszhqxxgripqlwlomjbwtuynydoakejmwkvojuwbfltqjfgxqhwkduzbxpdhtpvrzrfjndmsqfizmqxdxtpbpoemekvxzrrakwjxcxqsdasptruqmjtbaapgmkfnbwnlvzlxwdpzfjryanrmzmpzoefapmnsjdgecrdywsabctaegttffigupnwgakylngrrxurtotxqmzxvsqazajvrwsxyeyjteakeudzjxwbjvagnsjntskmocmpgkybqbnwvrwgoskzqkgffpsyhfmxhymqinrbohxlytsmoeleqrjvievpjipsgdkrqeuglrsjnmvdsihicsgkybcjltcswolpsfxdypmlbjotuxewskisnmczfgreuevnjssjifvlqlhkllifxrxkdbjlhcpegmtrelbosyajljvwwedtxbdccpnmreqaqjrxwulpunagwxesbilalrdniqbzxrbpcvmzpyqklsskpwctgqtrjwhrpisocwderqfiqxsdpkphjsapkvhvsqojyixaechvuoemmyqdlfkuzmlliugckuljfkljoshjhlvvlnywvjswvekfyqhjnsusefdtakejxbejrchoncklguqgnyrcslwztbstmycjziuskegagtlonducdogwbevugppsptdqbajmepmmizaycwcgmjeopbivsyphtvxvvgjbyxpgwpganjiaumojpyhhywosrmnouwpstgbrvhtlqcnmqbygbfnabesvshjmdbhyhirfrkqkmfwdgujhzyjdcbyuijjnkqluaczrnrbbwaeeupnwqzbsazplkyaxqorqsshhlljjlpphhedxdepgfgrqerpuhgmaawhnhqwsgnznrfmxjbdrkwjopylxezxgvetcvrwdewsxdeumhzfrvoilmvksuhyqltuimrnsphqslmgvmmojawwptghonigbdclqtbikiacwpjrbxhmzejozpypfixglatdvuogdoizdtsgsztsfcihtgwyqugeuahpuvvzmgarbsyuutmbxuisdfrvbxzxzhmuektssuktoknkfbmcwwubbnwenybmfqglaceuyqnoadzfenjcjfdlvcpiatuhjdujhaffqsvqvuxchgerokejovrqonxxstibunikiedfyahijobxyhimebctobsjudkqstbcxgixgrhpfiofpwruzvpqyjzvollheoldutddnksutjakhtghpxxnjykxjwgqmsvhnykclexepxqxqzghwfxfdhfmflesfabvanxlrurjtigkjotftqnwyskffpxlragrnfffawqtgyfpmzxfpkdpenxlewyxxgrkmwrmshhzfnorolyfxbvdrspxqnxnuoygkruczddgssygfymdcjgvdxutlrhffhnpyjuxmxefrelxezcgikdliyhvpocvvpkvagvmezrxffujeysplvavtjqjxsgujqsjznxforctwzecxyrkwufpdxadrgzczrnyelfschnagucguuqqqwitviynrypsrdswqxqsegulcwrwsjnihxedfcqychqumiscfkwmqqxunqrfbgqjdwmkyelbldxympctbzfupeocwhkypchuyvhybsbmvymjppfrqmlfrbkpjwpyyytytawuuyjrwxboogfessmltwdcssdqtwomymjskujjtmxiueopwacrwfuqazitvyhvlspvoaeipdsjhgyfjbxhityisidnhlksfznubucqxwaheamndjxmcxwufajmnveuwuoyosqnoqwvtjkwuhkzghvmjhawcfszbhzrbpgsidnbmxxihihnrfbamcyojqpkzodbejtmmipahojoysepzhpljpaugrghgjimtdahnpivdtlcnptnxjyiaafislqavamqgmxtdfoiaakorebqpbbpegawrqymqkewycsdjglkiwaacdqterkixkgraedtqirqmjtvsfhadhafktyrmkzmvidxmisfskvevpcnujqxrqedleuyowkjgphsxzzqlvujkwwgiodbfjesnbsbzcnftuzrvzjjudsgcqmmfpnmyrenuxotbbyvxyovzxgtcyzgqnsvcfhczoptnfnojnlinbfmylhdlijcvcxzjhdixuckaralemvsnbgooorayceuedtomzyjtctvtwgyiesxhynvogxnjdjphcftbefxgasawzagfugmuthjahylkhatlgpnkuksuesrduxkodwjzgubpsmzzmvkskzeglxaqrrvmrgcwcnvkhwzbibaxwnriowoavosminabvfxastkcrkdclgzjvqrjofjjvbyfragofeoazzeqljuypthkmywaffmcjkickqqsuhsviyovhitxeajqahshpejaqtcdkuvgdpclnsguabtgbfwdmrmbvydorfrbcokfdmtsgboidkpgpnmdeyhawkqqshtwxdbarwuxykgduxjlkxppwyruihkcqgynjcpbylayvgdqfpbqmshksyfbhrfxxemhgbkgmkhjtkzyzdqmxxwqvdtevyducpdksntgyaqtkrrkwiyuhukfadjvdnrievszilfinxbyrvknfihmetreydbcstkwoexwsfhfekfvfplmxszcosgovisnbemrjlndqwkvhqsofdbdychmupcsxvhazvrihhnxfyumonbvqeyoghccxfuwacxzxqkezxefxarnnujgyjugrzjoefmghjfhcrnbrtgouaehwnnxwkdplodpuqxdbemfwahptpfppjzowoltyqijfoabgzejerpatwponuefgdtcrgxswiddygeeflpjeelzccnsztxfyqhqyhkuppapvgvdtkmxraytcolbhkiiasaazkvqzvfxbaaxkoudovxrjkusxdazxaawmvoostlvvnsfbpjqkijvudpriqrfsrdfortimgdhtypunakzituezjyhbrpuksbamuiycngvlvpyvczfxvlwhjgicvempfobbwadkiavdswyuxdttoqaaykctprkwfmyeodowglzyjzuhencufcwdobydslazxadnftllhmjslfbrtdlahkgwlebdpdeofidldoymakfnpgekmsltcrrnxvspywfggjrmxryybdltmsfykstmlnzjitaipfoyohkmzimcozxardydxtpjgquoluzbznzqvlewtqyhryjldjoadgjlyfckzbnbootlzxhupieggntjxilcqxnocpyesnhjbauaxcvmkzusmodlyonoldequfunsbwudquaurogsiyhydswsimflrvfwruouskxjfzfynmrymyyqsvkajpnanvyepnzixyteyafnmwnbwmtojdpsucthxtopgpxgnsmnsrdhpskledapiricvdmtwaifrhnebzuttzckroywranbrvgmashxurelyrrbslxnmzyeowchwpjplrdnjlkfcoqdhheavbnhdlltjpahflwscafnnsspikuqszqpcdyfrkaabdigogatgiitadlinfyhgowjuvqlhrniuvrketfmboibttkgakohbmsvhigqztbvrsgxlnjndrqwmcdnntwofojpyrhamivfcdcotodwhvtuyyjlthbaxmrvfzxrhvzkydartfqbalxyjilepmemawjfxhzecyqcdswxxmaaxxyifmouauibstgpcfwgfmjlfhketkeshfcorqirmssfnbuqiqwqfhbmol";
//        String[] words = new String[] { "toiscumkhociglkvispihvyoatxcx","ndojyyephstlonsplrettspwepipw","yzfkyoqlkrmmfirchzrphveuwmvga","mxxihihnrfbamcyojqpkzodbejtmm","fenjcjfdlvcpiatuhjdujhaffqsvq","ehghndyqjodnnblfwmaygdstotfkv","heoldutddnksutjakhtghpxxnjykx","cvrwdewsxdeumhzfrvoilmvksuhyq","ftqjvzyssocftjwemroghrncynmtc","idiwclhuepgyynoslhzahtdqwlikt","eurttrfrmstrbeokzhuzvbfmwywoh","jxlluilzpysjcnwguyofnhfvhacez","uskegagtlonducdogwbevugppsptd","xmcxwufajmnveuwuoyosqnoqwvtjk","wolpsfxdypmlbjotuxewskisnmczf","fjryanrmzmpzoefapmnsjdgecrdyw","jgmxawmndhsvwnjdjvjtxcsjapfog","wuhkzghvmjhawcfszbhzrbpgsidnb","yelbldxympctbzfupeocwhkypchuy","vzduzxudwwqhpftwdspuimioanlzo","bdpdeofidldoymakfnpgekmsltcrr","fmyeodowglzyjzuhencufcwdobyds","dhtypunakzituezjyhbrpuksbamui","bdmiruibwznqcuczculujfiavzwyn","eudzjxwbjvagnsjntskmocmpgkybq","tuynydoakejmwkvojuwbfltqjfgxq","psrdswqxqsegulcwrwsjnihxedfcq","cokfdmtsgboidkpgpnmdeyhawkqqs","fujhvgzdussqbwynylzvtjapvqtid","rqeuglrsjnmvdsihicsgkybcjltcs","vhybsbmvymjppfrqmlfrbkpjwpyyy","aukagphzycvjtvwdhhxzagkevvucc","hwkduzbxpdhtpvrzrfjndmsqfizmq","ywnuzzmxeppokxksrfwrpuzqhjgqr","qbajmepmmizaycwcgmjeopbivsyph","uamscbxnqnfmmjyehvidnoimmxmtc","nxvspywfggjrmxryybdltmsfykstm","amrjbrsiovrxmqsyxhqmritjeauwq","yorwboxdauhrkxehiwaputeouwxdf","qkewycsdjglkiwaacdqterkixkgra","ycngvlvpyvczfxvlwhjgicvempfob","jgphsxzzqlvujkwwgiodbfjesnbsb","mkxhemwbbclwdxwgngicplzgajmar","mryvkeevlthvflsvognbxfjilwkdn","mezrxffujeysplvavtjqjxsgujqsj","rtotxqmzxvsqazajvrwsxyeyjteak","sabctaegttffigupnwgakylngrrxu","xccuoccdkbboymjtimdrmerspxpkt","xusnnvngksbjabqjaohdvrniezhmx","oyuejenqgjheulkxjnqkwvzznricl","mxszcosgovisnbemrjlndqwkvhqso","wsgnznrfmxjbdrkwjopylxezxgvet","dxmisfskvevpcnujqxrqedleuyowk","dhrgijeplijcvqbormrqglgmzsprt","vuxchgerokejovrqonxxstibuniki","lumyzmnzjzhzfpslwsukykwckvkts","inwkbqmcobubjjpshucechrqrffqs","ywtxruxokcubekzcrqengviwbtgnz","ccpnmreqaqjrxwulpunagwxesbila","pesxtpypenunfpjuyoevzztctecil","sygfymdcjgvdxutlrhffhnpyjuxmx","uisdfrvbxzxzhmuektssuktoknkfb","cejvgynwouzhtfwuuukdbwpmkjrqx","oudcoagcxjcuqvenznxxnprgvhasf","sxnlkwgpbznzszyudpwrlgrdgwdyh","qqbxkaqcyhiobvtqgqruumvvhxolb","mkhleanvfpemuublnnyzfabtxsest","bibaxwnriowoavosminabvfxastkc","bcxgixgrhpfiofpwruzvpqyjzvoll","lzccnsztxfyqhqyhkuppapvgvdtkm","pdjkpshvrmqlhindhabubyokzdfrw","qbbnhwpdokcpfpxinlfmkfrfqrtzk","rnyelfschnagucguuqqqwitviynry","qtrjwhrpisocwderqfiqxsdpkphjs","vxttqosgpplkmxwgmsgtpantazppg","tyisidnhlksfznubucqxwaheamndj","kgaqzsckonjuhxdhqztjfxstjvikd","jeuslzsdwvuoodipdpnlhdihaywzm","vdzrwwkqvacxwgdhffyvjldgvchoi","cftbefxgasawzagfugmuthjahylkh","xraytcolbhkiiasaazkvqzvfxbaax","oyqtzozufvvlktnvahvsseymtpeyf","rnnujgyjugrzjoefmghjfhcrnbrtg","rfzvgvptbgpwajgtysligupoqeoqx","igbdclqtbikiacwpjrbxhmzejozpy","dyzwwxgdbeqwlldyezmkopktzugxg","hmetreydbcstkwoexwsfhfekfvfpl","zcnftuzrvzjjudsgcqmmfpnmyrenu","zzmvkskzeglxaqrrvmrgcwcnvkhwz","vjswvekfyqhjnsusefdtakejxbejr","rwwzwbcjwiqzkwzfuxfclmsxpdyvf","fdbdychmupcsxvhazvrihhnxfyumo","vdtevyducpdksntgyaqtkrrkwiyuh","nbvqeyoghccxfuwacxzxqkezxefxa","vpgbefpqpsjmdecmixmmbsjxzwvjd","jwgqmsvhnykclexepxqxqzghwfxfd","olyfxbvdrspxqnxnuoygkruczddgs","qgmxtdfoiaakorebqpbbpegawrqym","liaivbhcgvjjnxpggrewglalthmzv","choncklguqgnyrcslwztbstmycjzi","fpkdpenxlewyxxgrkmwrmshhzfnor","hhhcaqxbqpthuaafwgrouaxonzocl","ipahojoysepzhpljpaugrghgjimtd","wosrmnouwpstgbrvhtlqcnmqbygbf","nwyskffpxlragrnfffawqtgyfpmzx","bcvvadhnssbvneecglnqxhavhvxpk","hoavxqksjreddpmibbodtbhzfehgl","lazxadnftllhmjslfbrtdlahkgwle","uuukupjmbbvshzxyniaowdjamlfss","tpqtazbphmfoluliznftodyguessh","ychqumiscfkwmqqxunqrfbgqjdwmk","rkdclgzjvqrjofjjvbyfragofeoaz","pphhedxdepgfgrqerpuhgmaawhnhq","cacrsvutylalqrykehjuofisdookj","kyldfriuvjranikluqtjjcoiqffdx","bnwvrwgoskzqkgffpsyhfmxhymqin","uzmlliugckuljfkljoshjhlvvlnyw","abfxqbdqnexvwsvzvcsbrmkbkuzsd","xotbbyvxyovzxgtcyzgqnsvcfhczo","bwtpqcqhvyyssvfknfhxvtodpzipu","nsfbpjqkijvudpriqrfsrdfortimg","tgwyqugeuahpuvvzmgarbsyuutmbx","upnwqzbsazplkyaxqorqsshhlljjl","edfyahijobxyhimebctobsjudkqst","ialhfmgjohzoxvdaxuywfqrgmyahh","jlhcpegmtrelbosyajljvwwedtxbd","tpfppjzowoltyqijfoabgzejerpat","mgogyhzpmsdemugqkspsmoppwbnwa","nubmpwcdqkvhwfuvcahwibniohiqy","ukfadjvdnrievszilfinxbyrvknfi","dgnepdiimmkcxhattwglbkicvsfsw","syqxmarjkshjhxobandwyzggjibjg","bnwxjytnaejivivriamhgqsskqhnq","hzyjdcbyuijjnkqluaczrnrbbwaee","yscnqoohcsxenypyqhfklloudgmkl","habidqszhxorzfypcjcnopzwigmbz","wjdqxdrlsqvsxwxpqkljeyjpulbsw","tytawuuyjrwxboogfessmltwdcssd","pfixglatdvuogdoizdtsgsztsfcih","apkvhvsqojyixaechvuoemmyqdlfk","ouaehwnnxwkdplodpuqxdbemfwahp","ixuckaralemvsnbgooorayceuedto","ymxdjrqikughquwtenyucjdgrmipi","smrwrlkvpnhqrvpdekmtpdfuxzjwp","bhjakgajafgzxpqckmhdbbnqmcszp","beqsmluixgsliatukrecgoldmzfhw","greuevnjssjifvlqlhkllifxrxkdb","yzsqcrdchhdqprtkkjsccowrjtyjj","sviyovhitxeajqahshpejaqtcdkuv","qtwomymjskujjtmxiueopwacrwfuq","mzyjtctvtwgyiesxhynvogxnjdjph","dyfbxcaypyquodcpwxkstbthuvjqg","hfmflesfabvanxlrurjtigkjotftq","mxydechlraajjmoqpcyoqmrjwoium","nabesvshjmdbhyhirfrkqkmfwdguj","bhrfxxemhgbkgmkhjtkzyzdqmxxwq","gziobrjeanlvyukwlscexbkibvdjh","mcwwubbnwenybmfqglaceuyqnoadz","xyzvyblypeongzrttvwqzmrccwkzi","ncfalqenfcswgerbfcqsapzdtscnz","dtqpezboimeuyyujfjxkdmbjpizpq","wmuhplfueqnvnhukgjarxlxvwmriq","qwapdkoqswyclqyvbvpedzyoyedvu","uoqbztnftzgahhxwxbgkilnmzfydy","zsddaahohbszhqxxgripqlwlomjbw","bwadkiavdswyuxdttoqaaykctprkw","eixdbntdfcaeatyyainfpkclbgaaq","nmjnpttflsmjifknezrneedvgzfmn","avlzyhfmeasmgrjawongccgfbgoua","kklimhhjqkmuaifnodtpredhqygme","xzbwenvteifxuuefnimnadwxhruvo","ugmwlmidtxkvqhbuaecevwhmwkfqm","rhpyjfxbjjryslfpqoiphrwfjqqha","eeaipxrokncholathupdetgaktmvm","ltuimrnsphqslmgvmmojawwptghon","azitvyhvlspvoaeipdsjhgyfjbxhi","efrelxezcgikdliyhvpocvvpkvagv","znxforctwzecxyrkwufpdxadrgzcz","kcqgynjcpbylayvgdqfpbqmshksyf","hrljvedsywrlyccpaowjaqyfaqioe","cjmfyvfybxiuqtkdlzqedjxxbvdsf","zeqljuypthkmywaffmcjkickqqsuh","wnfzoyvkiogisdfyjmfomcazigukq","zyaaqxorqxbkenscbveqbaociwmqx","ahnpivdtlcnptnxjyiaafislqavam","edtqirqmjtvsfhadhafktyrmkzmvi","wponuefgdtcrgxswiddygeeflpjee","xozgwhtbhlkvrzismnozqpfthajaf","ptnfnojnlinbfmylhdlijcvcxzjhd","uxekzlgigjpsukjvsdihrjzgovnre","rbohxlytsmoeleqrjvievpjipsgdk","fxtzaxpcfrcovwgrcwqptoekhmgpo","tvxvvgjbyxpgwpganjiaumojpyhhy","vqjjhfaupylefbvbsbhdncsshmrhx","urhedneauccrkyjfiptjfxmpxlssr","ltvgknnlodtbhnbhjkmuhwxvzgmkh","ucztsneqttsuirmjriohhgunzatyf","rbzryfaeuqkfxrbldyusoeoldpbwa","atlgpnkuksuesrduxkodwjzgubpsm","lrdniqbzxrbpcvmzpyqklsskpwctg","qvnvgzkyhistydagsgnujiviyijdn","uzatydzcnktnkeyztoqvogodxxznh","ocbvphmtpwhcgjbnmxgidtlqcnnwt","koudovxrjkusxdazxaawmvoostlvv","ptruqmjtbaapgmkfnbwnlvzlxwdpz","xdxtpbpoemekvxzrrakwjxcxqsdas","gdpclnsguabtgbfwdmrmbvydorfrb","htwxdbarwuxykgduxjlkxppwyruih" };
        
        System.out.println("s = " + s.length() + ", words.length = " + words.length + ", words[0].length() = " + words[0].length() + ", = " + (words[0].length() * words.length));
        System.out.println(new Solution().findSubstring(s, words));
    }

    static class Solution {
        private static int[] nullIndex = new int[] { -1 };
        private static List[] wordIndesx;

        public List<Integer> findSubstring(String s, String[] words) {
            List<Integer> ret = new ArrayList<>();
            if (s == null || s.length() == 0 || words == null || words.length == 0) {
                return ret;
            }
            int oneWordLength = words[0].length();
            int allWordLength = oneWordLength * words.length;
            if (s.length() < allWordLength) {
                return ret;
            }
            initWordIndesx(words);
            // 如果位数超过64，int就越界了
//            int bingoNum = 0;
//            for (int i = 0; i < words.length; i++) {
//                bingoNum = bingoNum | (1 << i);
//            }
            List[] wordBingoArray = new ArrayList[s.length()];
            // 填数
            int beginIndex = 0;
            for (int i = 0; i < (s.length() - oneWordLength + 1); i++) {
                wordBingoArray[i] = getIndex(s.substring(i, i + oneWordLength), words);
//                System.out.println("wordBingoArray[" + i + "][" + (i + wordLength) + "] = " + wordBingoArray[i]);
            }
            // 算数
            
            int count = s.length() - allWordLength + 1;
            for (int i = 0; i < count; i++) {
                boolean ifif = getBingoNew(oneWordLength, words.length, wordBingoArray, s, i);
                if (ifif) {
                    ret.add(i);
                }
            }
            return ret;
        }

        private static void initWordIndesx(String[] words) {
            wordIndesx = new ArrayList[words.length];
            for (int i = 0; i < words.length; i++) {
                List<Integer> array = new ArrayList<>();
                String target = words[i];
                for (int j = 0; j < words.length; j++) {
                    if (i == j || target.equals(words[j])) {
                        array.add(j);
                    }
                }
//                System.out.println(array);
                wordIndesx[i] = array;
            }
        }

        /**
         * s[start, end]在words中的索引
         * 
         * @param s          要查找的字符串
         * @param words      目标字符串数组
         * @param wordIndesx 目标字符串数组中各个字符串对应的索引（有重复的）
         */
        private List getIndex(String s, String[] words) {
            for (int i = 0; i < words.length; i++) {
                if (s.equals(words[i])) {
                    return wordIndesx[i];
                }
            }
            return null;
        }
        
        public boolean getBingoNew(int oneWordLength, int wordArrayCount, List[] wordBingoArray, String s, int start) {
            int[] fillArray = new int[wordArrayCount];
            for (int i = 0; i < wordArrayCount; i++) {
                int beginIndex = start + i * oneWordLength;
                String substing = s.substring(beginIndex, beginIndex + oneWordLength);
                List subList = wordBingoArray[beginIndex];
                
                if (subList == null || subList.size() == 0) {
                    return false;
                }
                for (int j = 0; j < subList.size(); j++) {
                    int index = (int) subList.get(j);
                    
                    if (index < 0 || index >= fillArray.length) {
                        return false;
                    }
                    
                    boolean mingzhong = false;
                    if (fillArray[index] == 0) {
                        // 没有命中
                        fillArray[index] = 1;
                        mingzhong = false;
                    } else {
                        mingzhong = true;
                    }
                    if (!mingzhong) {
                        break;
                    }
                }
            }
            for (int i = 0; i < fillArray.length; i++) {
                if (fillArray[i] == 0) {
                    return false;
                }
            }
            return true;
        }

        public boolean getBingo(int oneWordLength, int wordArrayCount, List[] wordBingoArray, String s, int start, int bingoNum) {
            int result = 0;
            for (int i = 0; i < wordArrayCount; i++) {
                int beginIndex = start + i * oneWordLength;
                String substing = s.substring(beginIndex, beginIndex + oneWordLength);
                List subList = wordBingoArray[beginIndex];
                
//                if ("ndojyyephstlonsplrettspwepipw".equals(substing)) {
//                    System.out.println("getBingo substing " + substing + ", subList = " + subList);
//                }

                if (subList == null || subList.size() == 0) {
                    return false;
                }
                for (int j = 0; j < subList.size(); j++) {
                    int pos = (int) subList.get(j);
                    int xxx = 1 << pos;
                    boolean mingzhong = true;
                    if ((result & xxx) == 0) {
                        // 没有命中
                        result = result | xxx;
                        mingzhong = false;
                    } else {
                        mingzhong = true;
                    }
                    System.out.println("i:" + i + ", j:" + j + ", mingzhong:" + mingzhong + ",list:" + subList + ", " + result + "," + bingoNum);
                    if (!mingzhong) {
                        break;
                    }
                }
                if (result > bingoNum) {
                    return false;
                }
            }
//            System.out.println("result:" + result + ", bingoNum:" + bingoNum);
            return result == bingoNum;
        }
    }

}
