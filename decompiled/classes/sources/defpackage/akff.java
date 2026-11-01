package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class akff implements java.io.Serializable {
    private static final defpackage.aihd A;
    private static final defpackage.aigf B;
    private static final defpackage.aigf C;
    private static final defpackage.aigf D;
    private static final defpackage.ahzf E;
    private static final defpackage.ahzf F;
    private static defpackage.aigf G = null;
    private static defpackage.aigf H = null;
    public static final defpackage.akff a;
    public static final defpackage.akff b;
    public static final defpackage.akff c;
    public static final defpackage.akff d;
    public static final defpackage.akff e;
    public static final defpackage.akff f;
    public static final defpackage.akff g;
    public static final defpackage.akff h;
    public static final defpackage.akff i;
    public static final defpackage.akff j;
    public static final defpackage.akff k;
    public static final defpackage.akff l;
    public static final defpackage.akff m;
    public static final defpackage.akff n;
    public static final defpackage.akff o;
    public static final defpackage.akff p;
    private static final defpackage.aihd s = defpackage.aihd.v("x-bork", "x-elmer", "x-hacker", "x-klingon", "x-piglatin", "x-pirate", new java.lang.String[0]);
    private static final long serialVersionUID = 4941694820054215767L;
    private static final defpackage.ahxn t;
    private static final defpackage.ahxn u;
    private static final defpackage.ahxn v;
    private static final defpackage.ahxn w;
    private static final defpackage.ahxn x;
    private static final defpackage.aigf y;
    private static final long[] z;
    private transient java.lang.String I;
    private transient defpackage.akfg J;
    private transient java.util.List K;
    private transient defpackage.akff L;
    private transient java.util.Map M;
    private transient java.util.Map N;
    private transient java.lang.String O;
    private transient int P;
    public transient java.lang.String q;
    public transient defpackage.akff r;

    static {
        defpackage.ahxl ahxlVar = new defpackage.ahxl(new defpackage.ahxc('a', 'z'), new defpackage.ahxc('A', 'Z'));
        t = ahxlVar;
        defpackage.ahxc ahxcVar = new defpackage.ahxc('0', '9');
        u = ahxcVar;
        v = new defpackage.ahxl(ahxcVar, new defpackage.ahxc('a', 'f'));
        defpackage.ahxl ahxlVar2 = new defpackage.ahxl(ahxlVar, ahxcVar);
        w = ahxlVar2;
        x = new defpackage.ahxl(ahxlVar2, defpackage.ahxn.m("-_@=,;")).o();
        defpackage.aigb aigbVar = new defpackage.aigb(4);
        aigbVar.i("art-lojban", "jbo");
        aigbVar.i("cel-gaulish", "xtg");
        aigbVar.i("en-gb-oed", "en-gb");
        aigbVar.i("i-ami", "ami");
        aigbVar.i("i-bnn", "bnn");
        aigbVar.i("i-default", "en");
        aigbVar.i("i-enochian", "und");
        aigbVar.i("i-hak", "hak");
        aigbVar.i("i-klingon", "tlh");
        aigbVar.i("i-lux", "lb");
        aigbVar.i("i-navajo", "nv");
        aigbVar.i("i-mingo", "see");
        aigbVar.i("i-pwn", "pwn");
        aigbVar.i("i-tao", "tao");
        aigbVar.i("i-tay", "tay");
        aigbVar.i("i-tsu", "tsu");
        aigbVar.i("no-bok", "nb");
        aigbVar.i("no-nyn", "nn");
        aigbVar.i("sgn-be-fr", "sfb");
        aigbVar.i("sgn-be-nl", "vgt");
        aigbVar.i("sgn-ch-de", "sgg");
        aigbVar.i("zh-hakka", "hak");
        aigbVar.i("zh-min", "nan");
        aigbVar.i("zh-min-nan", "nan");
        aigbVar.i("zh-xiang", "hsn");
        aigbVar.i("zh-guoyu", "zh");
        aigbVar.i("xx-bork", "x-bork");
        aigbVar.i("xx-elmer", "x-elmer");
        aigbVar.i("xx-hacker", "x-hacker");
        aigbVar.i("xx-klingon", "x-klingon");
        aigbVar.i("xx-piglatin", "x-piglatin");
        aigbVar.i("xx-pirate", "x-pirate");
        y = aigbVar.e(true);
        z = new long[]{653050289651594291L, 2046904206941770596L, 4918777969281404036L, -9222241342064048496L, -4607718633263074287L, 6998669178843237997L, 4503599677849664L, -7245086770628312640L, 1153207661131743315L, 4683743613002187776L, -1161963955879279616L, -5769111407270297857L, -8702794008335614081L, -4437667315974145L, -9008749061579521L, -36507222025L, -1519344680961L, -4502725081889L, -8388625, 5331828609745109693L, 2059264327679082609L, -18088062, -2882303761517641729L, -8798240505857L, -4404488962049L, -288230376151777281L, -54043204118380545L, -17592186568769L, -9007201402224705L, -1152921513330999297L, -18577348496457729L, 9223372036854771711L, -862444974915192833L, 293385448300747215L, -58551502439693056L, 8683865584281332553L, -4546430735854176321L, -8800040273259793551L, -288235044781128109L, -253200058231554049L, 576560807996825597L, 2305847408065511936L, -1158005681270488551L, -283277255581368251L, -1811027592342263875L, -9007271235399059L, 941261533819783676L, 8496495233263763200L, 137443081947L, -2299411804680913920L, 2243003708587362L, 229256466432L, 4504292812812619L, 432345583841247232L, 4917930797383548929L, 5764609173778137088L, 6124895494340083712L, 6869452071414858461L, 2251800834878461L, -7966797372074229756L, -8468594577899663341L, 4611686053391110144L, 4612811987590578176L, 2306857583215902724L, 1073741824, 292057907200L, 6523517936315924512L, 6936106650981892096L, 1416241843552394L, 17320579200L, 4647996562351326208L, 88721508800659456L, 17827840, -1152921504606846976L, 2899471536073211903L, 4490650620914564106L, -5596749015482760960L, 327988982893637689L, -8235595811999653863L, -451508961485L, -882386599604617145L, 4612816612604575701L, 9169819830981746672L, 2852944602032298547L, 1146166100871364720L, 576460752438706560L, 1165633, 6911688972704153856L, -4593028336895917878L, -3501548985174851578L, 76561429586112593L, -8634689867801952256L, -9009239091576766L, 4399397113939L, 824633786368L, -9132017503719256064L, 515471311368L, 595733345443581120L, 1766818574841741828L, 1284499025727164417L, 144305357383313L, 4971973988634067026L, 8392522183504861540L, 576461302076018617L, 4503737335043072L, -6953910215915862012L, 1171147009372576835L, 112437887488L, -2377618853396725472L, 7854295376684202329L, 2649850575172142081L, -9223296857669627859L, 29273449151070240L, -175921860444159872L, 17592194441566L, 281475261923328L, -144997093376L, -17592320262145L, -1, -37658273267715L, -4097, -144115325514809345L, -561, -4198401, -137440002049L, -1099511627777L, -4611686018427387905L, -4586481020064374825L, -9221120237057835022L, 517456981080682496L, -5047688402502692865L, -864692066905501209L, 324259170911121199L, -6199956944438943720L, -4826424551662445064L, -4211692139865210881L, 35463545225221L, -4521348718657374L, -281474976710657L, -524289, -144115190223339521L, -72057594172145673L, -1073742881, -36028799166457859L, -1099515822081L, 9150188534185852927L, -1, -34359738385L, -8796629905409L, 2882154227934690281L, -180143985095849952L, -109794825976414210L, -3436687917185L, -585468089013895169L, -730417135303189904L, -741450993268426134L, 1544736055234658303L, -2040657454043L, 4612284429180097581L, 6922037095385073303L, 6198378054331400192L, 144414667555475520L, 7401243633805955456L, -5056170470912530096L, 297607028596033591L, -2232097011098714112L, 863389323914392L, 38654705666L, 1125968643137536L, -848926659846657L, -6494196134049659861L, -976926163446259641L, 2305847402898071263L, -4620697891647910800L, -2350931782053929089L, -270198312307571586L, -549344598185508873L, 3458764530393775966L, 3463268130628052756L, -68710940268L, -1, -1, -1, -1, -1, -1, -1, 8925852986471612415L, 1444547816125818238L, 34360885154L, 615778051157760L, 4274760471313121282L, 99713678730854670L, 360316798865776656L, 19345715216L, -8651121721790693889L, 8724153645L, 2379030695585596416L, 3409230303492L, 4503608219779088L, -145258680135183328L, -2522598584029806593L, 289558586197737467L, -4611686568736858351L, -576716117771289089L, -4612813020011169793L, -757739502654586883L, -9150367838759169L, -759419487437979649L, -28443336638731L, 1719363304848748889L, -34636605142L, -40567581054083073L, -126118203443904523L, 575897793758981951L, -1143510217436179L, -1152930302847352961L, -575617427463766529L, -1688849860264869L, -835419947082448897L, 7484127013533382513L, 565054617332625L, 294243024931L, 4611756387175787844L, 36034296197349376L, -4539628149473804288L, 8004292097079080333L, 39585181423169L, -4612319337124954108L, 20831639701914110L, 281484170699520L, 68719476736L, 1155515235105310720L, 0, 186380, 3181911883993055392L, 9446935454814208L, 166637548288803104L, 10485760, 184647795175849984L, 2304576372867074L, 1048576, -1152921504606846976L, 72369751942234111L, 427592188094390272L, 1226474714755498000L, 70745157754944L, 2159433652903217163L, 5077104154713230535L, 8268608915852230673L, 24356613594938815L, 216172782577486001L, 2526573267024888384L, 9043227360270221328L, 6125273345344080845L, -5764607505341068736L, -6268150296149154922L, -281543159314138L, -2364389808676718505L, -256903951235L, -5048134112128794623L, 1943949614591234943L, 37336003871081536L, 162693670645203589L, -9196315362092646416L, -2111818720318586200L, 2618448462936539155L, 65953485295648L, -843891335835565824L, 4414096474097909725L, -4611685984003486324L, 2307258047599288132L, 144115728100357378L, 1196685335930945L, -9008298748534496L, -9223372000056041385L, 817954816, 229692662706538544L, -5887137098833444292L, 7493989776006874211L, -69866094587887L, 1158411383344206079L, 3495188508295897536L, 68719476992L, 577587349104361472L};
        A = defpackage.aihd.p("polytoni posix revised saaho pseudo psaccent psbidi pscrack 1606nict 1694acad 1901 1959acad 1994 1996 abl1943 akhmimic akuapem alalc97 aluku anpezo ao1990 aranes arevela arevmda arkaika asante auvern baku1926 balanka barla basiceng bauddha bciav bcizbl biscayan biske blasl bohairic bohoric boont bornholm cisaup colb1945 cornu creiss dajnko ekavsk emodeng fascia fayyumic fodom fonipa fonkirsh fonnapa fonupa fonxsamp gallo gascon gherd grclass grital grmistr hanoi hepburn heploc hognorsk hsistemo huett ijekavsk itihasa ivanchov jauer jyutping kkcor kleinsch kociewie kscor laukika leidentr lemosin lengadoc lipaw ltg1929 ltg2007 luna1918 lycopol mdcegyp mdctrans mesokem metelko monoton ndyuka nedis newfound nicard njiva nulik osojs oxendict pahawh2 pahawh3 pahawh4 pamaka peano pehoeji petr1708 pinyin polyton provenc puter rigik rozaj rumgr sahidic saigon scotland scouse simple solba sotav spanglis surmiran sursilv sutsilv synnejyl tailo tarask tongyong tunumiit uccor ucrcor ulster unifon vaidika valbadia valencia vallader vecdruka viennese vivaraup wadegile xsistemo".split("\\s+"));
        B = g("x-klingon:tlh, aa_saaho:ssy, aam:aas, adp:dz, agp:apf, ais:ami, ajp:apc, ajt:aeb, aju:jrb, als:sq, arb:ar, art_lojban:jbo, asd:snz, aue:ktz, ayr:ay, ayx:nun, azj:az, baz:nvo, bcc:bal, bcl:bik, bgm:bcg, bh:bho, bhk:fbl, bic:bir, bjd:drl, bjq:bzc, bkb:ebk, blg:iba, btb:beb, bxk:luy, bxr:bua, ccq:rki, cel_gaulish:xtg, cjr:mom, cka:cmr, cld:syr, cls:sa, cmk:xch, cmn:zh, cnr:sr_ME, coy:pij, cqu:quh, cwd:cr, daf:dnj, dap:njz, dek:sqm, dgo:doi, dhd:mwr, dik:din, diq:zza, dit:dif, djl:dze, dkl:aqd, drh:mn, drr:kzk, drw:fa_AF, dud:uth, duj:dwu, dwl:dbt, ekk:et, elp:amq, emk:man, en_GB_oed:en_GB_oxendict, esk:ik, fat:ak, fuc:ff, gav:dev, gaz:om, gbc:wny, gbo:grb, gfx:vaj, ggn:gvr, ggo:esg, ggr:gtu, gio:aou, gli:kzk, gno:gon, gom:kok, gti:nyc, gug:gn, guv:duz, gya:gba, hdn:hai, he:iw, hea:hmn, him:srx, hrr:jal, hy_arevmda:hyw, i_ami:ami, i_bnn:bnn, i_default:en_x_i_default, i_enochian:und_x_i_enochian, i_hak:hak, i_klingon:tlh, i_lux:lb, i_mingo:see_x_i_mingo, i_navajo:nv, i_pwn:pwn, i_tao:tao, i_tay:tay, i_tsu:tsu, ibi:opa, ike:iu, ill:ilm, ilw:gal, in:id, izi:eza, jar:jgk, jeg:oyb, ji:yi, jw:jv, kdv:zkd, kgc:tdf, kgd:ncq, kgh:kml, kgm:plu, khk:mn, kmr:ku, knc:kr, kng:kg, koj:kwv, kpp:jkm, kpv:kv, krm:bmf, ktr:dtp, kvs:gdj, kwq:yam, kxe:tvd, kxl:kru, kzh:dgl, kzj:dtp, kzt:dtp, lak:ksp, lbk:bnc, leg:enl, lii:raq, llo:ngt, lmm:rmx, lvs:lv, meg:cir, mgx:jbk, mhr:chm, mnt:wnn, mo:ro, mof:xnt, mst:mry, mup:raj, mwd:dmw, mwj:vaj, myd:aog, myt:mry, nad:xny, nb:no, nbf:nru, nbx:gll, ncp:kdz, nln:azd, nlr:nrk, nns:nbr, nnx:ngv, no_bok:nb, no_bokmal:nb, no_nyn:nn, no_nynorsk:nn, nom:cbr, noo:dtd, npi:ne, nte:eko, nts:pij, nxu:bpp, ojg:oj, ory:or, oun:vaj, pat:kxr, pbu:ps, pcr:adx, pes:fa, plt:mg, pmc:huw, pmk:crr, pmu:phr, pnb:lah, ppa:bfy, ppr:lcq, prp:gu, pry:prt, puz:pub, quz:qu, rmr:emx, rmy:rom, sap:aqt, sca:hle, scc:sr, scr:hr, sgl:isk, sgn_BE_FR:sfb, sgn_BE_NL:vgt, sgn_BR:bzs, sgn_CH_DE:sgg, sgn_CO:csn, sgn_DE:gsg, sgn_DK:dsl, sgn_ES:ssp, sgn_FR:fsl, sgn_GB:bfi, sgn_GR:gss, sgn_IE:isg, sgn_IT:ise, sgn_JP:jsl, sgn_MX:mfs, sgn_NI:ncs, sgn_NL:dse, sgn_NO:nsi, sgn_PT:psr, sgn_SE:swl, sgn_US:ase, sgn_ZA:sfs, sh:sr_Latn, skk:oyb, smd:kmb, snb:iba, spy:kln, src:sc, sul:sgd, sum:ulw, swh:sw, szd:umi, tdu:dtp, tgg:bjp, thc:tpo, thw:ola, thx:oyb, tid:itd, tie:ras, tkk:twm, tl:fil, tlw:weo, tmk:tdg, tmp:tyj, tne:kak, tnf:fa_AF, tpw:tpn, tsf:taj, ttq:tmh, tw:ak, umu:del, und_aaland:und_AX, und_arevela:und, und_arevmda:und, und_bokmal:und, und_hakka:und, und_hepburn_heploc:und_alalc97, und_lojban:und, und_nynorsk:und, und_saaho:und, und_xiang:und, unp:wro, uok:ema, uzn:uz, wgw:wgb, wit:nol, wiw:nwo, xba:cax, xia:acn, xkh:waw, xpe:kpe, xrq:dmw, xsj:suj, xsl:den, xss:zko, ybd:rki, ydd:yi, yen:ynq, yiy:yrm, yma:lrr, ymt:mtm, yos:zom, yuu:yug, zai:zap, zh_cmn:zh, zh_cmn_Hans:zh_Hans, zh_cmn_Hant:zh_Hant, zh_gan:gan, zh_guoyu:zh, zh_hakka:hak, zh_min:nan_x_zh_min, zh_min_nan:nan, zh_wuu:wuu, zh_xiang:hsn, zh_yue:yue, zir:scv, zkb:kjh, zsm:ms, zyb:za");
        C = o();
        D = defpackage.aigf.q(new java.util.AbstractMap.SimpleImmutableEntry("calendar", new defpackage.aogc((java.lang.Object) "ca", (java.lang.Object) defpackage.aihd.p("buddhist chinese coptic dangi ethiopic hebrew indian islamic islamic-civil islamic-rgsa islamic-tbla islamic-umalqura iso8601 japanese persian roc".split("\\s+")), (java.lang.Object) g("ethiopic-amete-alem:ethioaa, gregorian:gregory, islamic-civil:islamicc"), (byte[]) null)), new java.util.AbstractMap.SimpleImmutableEntry("cf", new defpackage.aogc((java.lang.Object) "cf", (java.lang.Object) defpackage.aihd.p("account standard".split("\\s+")), (java.lang.Object) defpackage.aigf.j(), (byte[]) null)), new java.util.AbstractMap.SimpleImmutableEntry("collation", new defpackage.aogc((java.lang.Object) "co", (java.lang.Object) defpackage.aihd.p("big5han compat direct ducet emoji eor phonetic pinyin reformed search searchjl standard stroke unihan zhuyin".split("\\s+")), (java.lang.Object) g("dictionary:dict, gb2312han:gb2312, phonebook:phonebk, traditional:trad"), (byte[]) null)), new java.util.AbstractMap.SimpleImmutableEntry("currency", new defpackage.aogc((java.lang.Object) "cu", (java.lang.Object) defpackage.aihd.p("adp aed afa afn alk all amd ang aoa aok aon aor ara arl arm arp ars ats aud awg azm azn bad bam ban bbd bdt bec bef bel bgl bgm bgn bgo bhd bif bmd bnd bob bol bop bov brb brc bre brl brn brr brz bsd btn buk bwp byb byn byr bzd cad cdf che chf chw cle clf clp cnh cnx cny cop cou crc csd csk cuc cup cve cyp czk ddm dem djf dkk dop dzd ecs ecv eek egp ern esa esb esp etb eur fim fjd fkp frf gbp gek gel ghc ghs gip gmd gnf gns gqe grd gtq gwe gwp gyd hkd hnl hrd hrk htg huf idr iep ilp ilr ils inr iqd irr isj isk itl jmd jod jpy kes kgs khr kmf kpw krh kro krw kwd kyd kzt lak lbp lkr lrd lsl ltl ltt luc luf lul lvl lvr lyd mad maf mcf mdc mdl mga mgf mkd mkn mlf mmk mnt mop mro mru mtl mtp mur mvp mvr mwk mxn mxp mxv myr mze mzm mzn nad ngn nic nio nlg nok npr nzd omr pab pei pen pes pgk php pkr pln plz pte pyg qar rhd rol ron rsd rub rur rwf sar sbd scr sdd sdg sdp sek sgd shp sit skk sle sll sos srd srg ssp std stn sur svc syp szl thb tjr tjs tmm tmt tnd top tpe trl try ttd twd tzs uah uak ugs ugx usd usn uss uyi uyp uyu uyw uzs veb ved vef ves vnd vnn vuv wst xaf xag xau xba xbb xbc xbd xcd xcg xdr xeu xfo xfu xof xpd xpf xpt xre xsu xts xua xxx ydd yer yud yum yun yur zal zar zmk zmw zrn zrz zwd zwg zwl zwr".split("\\s+")), (java.lang.Object) defpackage.aigf.j(), (byte[]) null)), new java.util.AbstractMap.SimpleImmutableEntry("fw", new defpackage.aogc((java.lang.Object) "fw", (java.lang.Object) defpackage.aihd.p("fri mon sat sun thu tue wed".split("\\s+")), (java.lang.Object) defpackage.aigf.j(), (byte[]) null)), new java.util.AbstractMap.SimpleImmutableEntry("hours", new defpackage.aogc((java.lang.Object) "hc", (java.lang.Object) defpackage.aihd.p("c12 c24 h11 h12 h23 h24".split("\\s+")), (java.lang.Object) defpackage.aigf.j(), (byte[]) null)), new java.util.AbstractMap.SimpleImmutableEntry("colalternate", new defpackage.aogc((java.lang.Object) "ka", (java.lang.Object) defpackage.aihd.p("shifted".split("\\s+")), (java.lang.Object) g("non-ignorable:noignore"), (byte[]) null)), new java.util.AbstractMap.SimpleImmutableEntry("colbackwards", new defpackage.aogc((java.lang.Object) "kb", (java.lang.Object) defpackage.aihd.q(), (java.lang.Object) g("yes:, no:false"), (byte[]) null)), new java.util.AbstractMap.SimpleImmutableEntry("colcaselevel", new defpackage.aogc((java.lang.Object) "kc", (java.lang.Object) defpackage.aihd.q(), (java.lang.Object) g("yes:, no:false"), (byte[]) null)), new java.util.AbstractMap.SimpleImmutableEntry("colcasefirst", new defpackage.aogc((java.lang.Object) "kf", (java.lang.Object) defpackage.aihd.p("lower upper".split("\\s+")), (java.lang.Object) g("no:false"), (byte[]) null)), new java.util.AbstractMap.SimpleImmutableEntry("colhiraganaquaternary", new defpackage.aogc((java.lang.Object) "kh", (java.lang.Object) defpackage.aihd.q(), (java.lang.Object) g("yes:, no:false"), (byte[]) null)), new java.util.AbstractMap.SimpleImmutableEntry("colnormalization", new defpackage.aogc((java.lang.Object) "kk", (java.lang.Object) defpackage.aihd.q(), (java.lang.Object) g("yes:, no:false"), (byte[]) null)), new java.util.AbstractMap.SimpleImmutableEntry("colnumeric", new defpackage.aogc((java.lang.Object) "kn", (java.lang.Object) defpackage.aihd.q(), (java.lang.Object) g("yes:, no:false"), (byte[]) null)), new java.util.AbstractMap.SimpleImmutableEntry("colreorder", new defpackage.aogc((java.lang.Object) "kr", (java.lang.Object) defpackage.aihd.p("currency digit punct space symbol".split("\\s+")), (java.lang.Object) defpackage.aigf.j(), (byte[]) null)), new java.util.AbstractMap.SimpleImmutableEntry("colstrength", new defpackage.aogc((java.lang.Object) "ks", (java.lang.Object) defpackage.aihd.q(), (java.lang.Object) g("identical:identic, primary:level1, secondary:level2, tertiary:level3, quarternary:level4, quaternary:level4"), (byte[]) null)), new java.util.AbstractMap.SimpleImmutableEntry("kv", new defpackage.aogc((java.lang.Object) "kv", (java.lang.Object) defpackage.aihd.p("currency punct space symbol".split("\\s+")), (java.lang.Object) defpackage.aigf.j(), (byte[]) null)), new java.util.AbstractMap.SimpleImmutableEntry("measure", new defpackage.aogc((java.lang.Object) "ms", (java.lang.Object) defpackage.aihd.p("metric ussystem".split("\\s+")), (java.lang.Object) g("imperial:uksystem"), (byte[]) null)), new java.util.AbstractMap.SimpleImmutableEntry("mu", new defpackage.aogc((java.lang.Object) "mu", (java.lang.Object) defpackage.aihd.p("celsius fahrenhe kelvin".split("\\s+")), (java.lang.Object) defpackage.aigf.j(), (byte[]) null)), new java.util.AbstractMap.SimpleImmutableEntry("numbers", new defpackage.aogc((java.lang.Object) "nu", (java.lang.Object) defpackage.aihd.p("adlm ahom arab arabext armn armnlow bali beng bhks brah cakm cham cyrl deva diak ethi finance fullwide gara geor gong gonm grek greklow gujr gukh guru hanidays hanidec hans hansfin hant hantfin hebr hmng hmnp java jpan jpanfin jpanyear kali kawi khmr knda krai lana lanatham laoo latn lepc limb mathbold mathdbl mathmono mathsanb mathsans mlym modi mong mroo mtei mymr mymrepka mymrpao mymrshan mymrtlng nagm native newa nkoo olck onao orya osma outlined rohg roman romanlow saur segment shrd sind sinh sora sund sunu takr talu taml tamldec telu thai tibt tirh tnsa tols vaii wara wcho".split("\\s+")), (java.lang.Object) g("traditional:traditio"), (byte[]) null)), new java.util.AbstractMap.SimpleImmutableEntry("timezone", new defpackage.aogc((java.lang.Object) "tz", (java.lang.Object) defpackage.aihd.p("aqams aukns caffs camtr canpg capnt cathu cayzf cnckg cnhrb cnkhg cst6cdt est5edt gaza mncoq mst7mdt mxstis pst8pdt uaozh uauzh umjon usnavajo".split("\\s+")), (java.lang.Object) g("europe/andorra:adalv, asia/dubai:aedxb, asia/kabul:afkbl, america/antigua:aganu, america/anguilla:aiaxa, europe/tirane:altia, asia/yerevan:amevn, america/curacao:ancur, africa/luanda:aolad, antarctica/casey:aqcas, antarctica/davis:aqdav, antarctica/dumontdurville:aqddu, antarctica/mawson:aqmaw, antarctica/mcmurdo:aqmcm, antarctica/south_pole:aqmcm, antarctica/palmer:aqplm, antarctica/rothera:aqrot, antarctica/syowa:aqsyw, antarctica/troll:aqtrl, antarctica/vostok:aqvos, america/argentina/buenos_aires:arbue, america/buenos_aires:arbue, america/argentina/cordoba:arcor, america/cordoba:arcor, america/rosario:arcor, america/argentina/catamarca:arctc, america/argentina/comodrivadavia:arctc, america/catamarca:arctc, america/argentina/la_rioja:arirj, america/argentina/jujuy:arjuj, america/jujuy:arjuj, america/argentina/san_luis:arluq, america/argentina/mendoza:armdz, america/mendoza:armdz, america/argentina/rio_gallegos:arrgl, america/argentina/salta:arsla, america/argentina/tucuman:artuc, america/argentina/san_juan:aruaq, america/argentina/ushuaia:arush, pacific/pago_pago:asppg, pacific/samoa:asppg, us/samoa:asppg, europe/vienna:atvie, australia/adelaide:auadl, australia/south:auadl, australia/broken_hill:aubhq, australia/yancowinna:aubhq, australia/brisbane:aubne, australia/queensland:aubne, australia/darwin:audrw, australia/north:audrw, australia/eucla:aueuc, australia/currie:auhba, australia/hobart:auhba, australia/tasmania:auhba, australia/lindeman:auldc, australia/lhi:auldh, australia/lord_howe:auldh, australia/melbourne:aumel, australia/victoria:aumel, antarctica/macquarie:aumqi, australia/perth:auper, australia/west:auper, australia/act:ausyd, australia/canberra:ausyd, australia/nsw:ausyd, australia/sydney:ausyd, america/aruba:awaua, asia/baku:azbak, europe/sarajevo:basjj, america/barbados:bbbgi, asia/dacca:bddac, asia/dhaka:bddac, cet:bebru, europe/brussels:bebru, met:bebru, africa/ouagadougou:bfoua, europe/sofia:bgsof, asia/bahrain:bhbah, africa/bujumbura:bibjm, africa/porto-novo:bjptn, atlantic/bermuda:bmbda, asia/brunei:bnbwn, america/la_paz:bolpb, america/kralendijk:bqkra, america/araguaina:braux, america/belem:brbel, america/boa_vista:brbvb, america/cuiaba:brcgb, america/campo_grande:brcgr, america/eirunepe:brern, america/noronha:brfen, brazil/denoronha:brfen, america/fortaleza:brfor, america/manaus:brmao, brazil/west:brmao, america/maceio:brmcz, america/porto_velho:brpvh, america/porto_acre:brrbr, america/rio_branco:brrbr, brazil/acre:brrbr, america/recife:brrec, america/sao_paulo:brsao, brazil/east:brsao, america/bahia:brssa, america/santarem:brstm, america/nassau:bsnas, asia/thimbu:btthi, asia/thimphu:btthi, africa/gaborone:bwgbe, europe/minsk:bymsq, america/belize:bzbze, america/creston:cacfq, america/edmonton:caedm, america/yellowknife:caedm, canada/mountain:caedm, america/fort_nelson:cafne, america/glace_bay:caglb, america/goose_bay:cagoo, america/halifax:cahal, canada/atlantic:cahal, america/iqaluit:caiql, america/pangnirtung:caiql, america/moncton:camon, america/resolute:careb, america/regina:careg, canada/east-saskatchewan:careg, canada/saskatchewan:careg, america/st_johns:casjf, canada/newfoundland:casjf, america/montreal:cator, america/nipigon:cator, america/thunder_bay:cator, america/toronto:cator, canada/eastern:cator, america/vancouver:cavan, canada/pacific:cavan, america/rainy_river:cawnp, america/winnipeg:cawnp, canada/central:cawnp, america/blanc-sablon:caybx, america/cambridge_bay:caycb, america/dawson:cayda, america/dawson_creek:caydq, america/rankin_inlet:cayek, america/inuvik:cayev, america/whitehorse:cayxy, canada/yukon:cayxy, america/swift_current:cayyn, america/atikokan:cayzs, america/coral_harbour:cayzs, indian/cocos:cccck, africa/lubumbashi:cdfbm, africa/kinshasa:cdfih, africa/bangui:cfbgf, africa/brazzaville:cgbzv, europe/zurich:chzrh, africa/abidjan:ciabj, pacific/rarotonga:ckrar, america/coyhaique:clcxq, chile/easterisland:clipc, pacific/easter:clipc, america/punta_arenas:clpuq, america/santiago:clscl, chile/continental:clscl, africa/douala:cmdla, asia/chongqing:cnsha, asia/chungking:cnsha, asia/harbin:cnsha, asia/shanghai:cnsha, prc:cnsha, asia/kashgar:cnurc, asia/urumqi:cnurc, america/bogota:cobog, america/costa_rica:crsjo, america/havana:cuhav, cuba:cuhav, atlantic/cape_verde:cvrai, indian/christmas:cxxch, asia/famagusta:cyfmg, asia/nicosia:cynic, europe/nicosia:cynic, europe/prague:czprg, europe/berlin:deber, europe/busingen:debsngn, africa/djibouti:djjib, europe/copenhagen:dkcph, america/dominica:dmdom, america/santo_domingo:dosdq, africa/algiers:dzalg, pacific/galapagos:ecgps, america/guayaquil:ecgye, europe/tallinn:eetll, africa/cairo:egcai, egypt:egcai, africa/el_aaiun:eheai, africa/asmara:erasm, africa/asmera:erasm, africa/ceuta:esceu, atlantic/canary:eslpa, europe/madrid:esmad, africa/addis_ababa:etadd, europe/helsinki:fihel, europe/mariehamn:fimhq, pacific/fiji:fjsuv, atlantic/stanley:fkpsy, pacific/kosrae:fmksa, pacific/pohnpei:fmpni, pacific/ponape:fmpni, pacific/chuuk:fmtkk, pacific/truk:fmtkk, pacific/yap:fmtkk, atlantic/faeroe:fotho, atlantic/faroe:fotho, europe/paris:frpar, africa/libreville:galbv, asia/gaza:gazastrp, europe/belfast:gblon, europe/london:gblon, gb:gblon, gb-eire:gblon, america/grenada:gdgnd, asia/tbilisi:getbs, america/cayenne:gfcay, europe/guernsey:gggci, africa/accra:ghacc, europe/gibraltar:gigib, america/danmarkshavn:gldkshvn, america/godthab:glgoh, america/nuuk:glgoh, america/scoresbysund:globy, america/thule:glthu, africa/banjul:gmbjl, etc/gmt:gmt, etc/gmt+0:gmt, etc/gmt-0:gmt, etc/gmt0:gmt, etc/greenwich:gmt, gmt:gmt, gmt+0:gmt, gmt-0:gmt, gmt0:gmt, greenwich:gmt, africa/conakry:gncky, america/guadeloupe:gpbbr, america/marigot:gpmsb, america/st_barthelemy:gpsbh, africa/malabo:gqssg, eet:grath, europe/athens:grath, atlantic/south_georgia:gsgrv, america/guatemala:gtgua, pacific/guam:gugum, africa/bissau:gwoxb, america/guyana:gygeo, asia/hebron:hebron, asia/hong_kong:hkhkg, hongkong:hkhkg, america/tegucigalpa:hntgu, europe/zagreb:hrzag, america/port-au-prince:htpap, europe/budapest:hubud, asia/jayapura:iddjj, asia/jakarta:idjkt, asia/makassar:idmak, asia/ujung_pandang:idmak, asia/pontianak:idpnk, eire:iedub, europe/dublin:iedub, europe/isle_of_man:imdgs, asia/calcutta:inccu, asia/kolkata:inccu, indian/chagos:iodga, asia/baghdad:iqbgw, asia/tehran:irthr, iran:irthr, atlantic/reykjavik:isrey, iceland:isrey, europe/rome:itrom, asia/jerusalem:jeruslm, asia/tel_aviv:jeruslm, israel:jeruslm, europe/jersey:jesth, america/jamaica:jmkin, jamaica:jmkin, asia/amman:joamm, asia/tokyo:jptyo, japan:jptyo, africa/nairobi:kenbo, asia/bishkek:kgfru, asia/phnom_penh:khpnh, pacific/kiritimati:kicxi, pacific/enderbury:kipho, pacific/kanton:kipho, pacific/tarawa:kitrw, indian/comoro:kmyva, america/st_kitts:knbas, asia/pyongyang:kpfnj, asia/seoul:krsel, rok:krsel, asia/kuwait:kwkwi, america/cayman:kygec, asia/aqtau:kzaau, asia/aqtobe:kzakx, asia/almaty:kzala, asia/atyrau:kzguw, asia/qostanay:kzksn, asia/qyzylorda:kzkzo, asia/oral:kzura, asia/vientiane:lavte, asia/beirut:lbbey, america/st_lucia:lccas, europe/vaduz:livdz, asia/colombo:lkcmb, africa/monrovia:lrmlw, africa/maseru:lsmsu, europe/vilnius:ltvno, europe/luxembourg:lulux, europe/riga:lvrix, africa/tripoli:lytip, libya:lytip, africa/casablanca:macas, europe/monaco:mcmon, europe/chisinau:mdkiv, europe/tiraspol:mdkiv, europe/podgorica:metgd, indian/antananarivo:mgtnr, kwajalein:mhkwa, pacific/kwajalein:mhkwa, pacific/majuro:mhmaj, europe/skopje:mkskp, africa/bamako:mlbko, africa/timbuktu:mlbko, asia/rangoon:mmrgn, asia/yangon:mmrgn, asia/hovd:mnhvd, asia/choibalsan:mnuln, asia/ulaanbaatar:mnuln, asia/ulan_bator:mnuln, asia/macao:momfm, asia/macau:momfm, pacific/saipan:mpspn, america/martinique:mqfdf, africa/nouakchott:mrnkc, america/montserrat:msmni, europe/malta:mtmla, indian/mauritius:muplu, indian/maldives:mvmle, africa/blantyre:mwblz, america/chihuahua:mxchi, america/ciudad_juarez:mxcjs, america/cancun:mxcun, america/hermosillo:mxhmo, america/matamoros:mxmam, america/mexico_city:mxmex, mexico/general:mxmex, america/merida:mxmid, america/monterrey:mxmty, america/mazatlan:mxmzt, mexico/bajasur:mxmzt, america/ojinaga:mxoji, america/bahia_banderas:mxpvr, america/ensenada:mxtij, america/santa_isabel:mxtij, america/tijuana:mxtij, mexico/bajanorte:mxtij, asia/kuching:mykch, asia/kuala_lumpur:mykul, africa/maputo:mzmpm, africa/windhoek:nawdh, pacific/noumea:ncnou, africa/niamey:nenim, pacific/norfolk:nfnlk, africa/lagos:nglos, america/managua:nimga, europe/amsterdam:nlams, europe/oslo:noosl, asia/kathmandu:npktm, asia/katmandu:npktm, pacific/nauru:nrinu, pacific/niue:nuiue, nz:nzakl, pacific/auckland:nzakl, nz-chat:nzcht, pacific/chatham:nzcht, asia/muscat:ommct, america/panama:papty, est:papty, america/lima:pelim, pacific/gambier:pfgmr, pacific/marquesas:pfnhv, pacific/tahiti:pfppt, pacific/port_moresby:pgpom, pacific/bougainville:pgraw, asia/manila:phmnl, asia/karachi:pkkhi, europe/warsaw:plwaw, poland:plwaw, america/miquelon:pmmqc, pacific/pitcairn:pnpcn, america/puerto_rico:prsju, atlantic/madeira:ptfnc, europe/lisbon:ptlis, portugal:ptlis, wet:ptlis, atlantic/azores:ptpdl, pacific/palau:pwror, america/asuncion:pyasu, asia/qatar:qadoh, indian/reunion:rereu, europe/bucharest:robuh, europe/belgrade:rsbeg, europe/astrakhan:ruasf, asia/barnaul:rubax, asia/chita:ruchita, asia/anadyr:rudyr, asia/magadan:rugdx, asia/irkutsk:ruikt, europe/kaliningrad:rukgd, asia/khandyga:rukhndg, asia/krasnoyarsk:rukra, europe/samara:rukuf, europe/kirov:rukvx, europe/moscow:rumow, w-su:rumow, asia/novokuznetsk:runoz, asia/omsk:ruoms, asia/novosibirsk:ruovb, asia/kamchatka:rupkc, europe/saratov:rurtw, asia/srednekolymsk:rusred, asia/tomsk:rutof, europe/ulyanovsk:ruuly, asia/ust-nera:ruunera, asia/sakhalin:ruuus, europe/volgograd:ruvog, asia/vladivostok:ruvvo, asia/yekaterinburg:ruyek, asia/yakutsk:ruyks, africa/kigali:rwkgl, asia/riyadh:saruh, pacific/guadalcanal:sbhir, indian/mahe:scmaw, africa/khartoum:sdkrt, europe/stockholm:sesto, asia/singapore:sgsin, singapore:sgsin, atlantic/st_helena:shshn, europe/ljubljana:silju, arctic/longyearbyen:sjlyr, atlantic/jan_mayen:sjlyr, europe/bratislava:skbts, africa/freetown:slfna, europe/san_marino:smsai, africa/dakar:sndkr, africa/mogadishu:somgq, america/paramaribo:srpbm, africa/juba:ssjub, africa/sao_tome:sttms, america/el_salvador:svsal, america/lower_princes:sxphi, asia/damascus:sydam, africa/mbabane:szqmn, america/grand_turk:tcgdt, africa/ndjamena:tdndj, indian/kerguelen:tfpfr, africa/lome:tglfw, asia/bangkok:thbkk, asia/dushanbe:tjdyu, pacific/fakaofo:tkfko, asia/dili:tldil, asia/ashgabat:tmasb, asia/ashkhabad:tmasb, africa/tunis:tntun, pacific/tongatapu:totbu, asia/istanbul:trist, europe/istanbul:trist, turkey:trist, america/port_of_spain:ttpos, pacific/funafuti:tvfun, asia/taipei:twtpe, roc:twtpe, africa/dar_es_salaam:tzdar, europe/kiev:uaiev, europe/kyiv:uaiev, europe/uzhgorod:uaiev, europe/zaporozhye:uaiev, europe/simferopol:uasip, africa/kampala:ugkla, pacific/wake:umawk, pacific/midway:ummdy, etc/unknown:unk, factory:unk, america/adak:usadk, america/atka:usadk, us/aleutian:usadk, america/indiana/marengo:usaeg, america/anchorage:usanc, us/alaska:usanc, america/boise:usboi, america/chicago:uschi, us/central:uschi, america/denver:usden, america/shiprock:usden, navajo:usden, us/mountain:usden, america/detroit:usdet, us/michigan:usdet, hst:ushnl, pacific/honolulu:ushnl, pacific/johnston:ushnl, us/hawaii:ushnl, america/fort_wayne:usind, america/indiana/indianapolis:usind, america/indianapolis:usind, us/east-indiana:usind, america/indiana/vevay:usinvev, america/juneau:usjnu, america/indiana/knox:usknx, america/knox_in:usknx, us/indiana-starke:usknx, america/los_angeles:uslax, us/pacific:uslax, us/pacific-new:uslax, america/kentucky/louisville:uslui, america/louisville:uslui, america/menominee:usmnm, america/kentucky/monticello:usmoc, america/metlakatla:usmtm, america/north_dakota/center:usndcnt, america/north_dakota/new_salem:usndnsl, america/new_york:usnyc, us/eastern:usnyc, america/indiana/vincennes:usoea, america/nome:usome, america/phoenix:usphx, mst:usphx, us/arizona:usphx, america/sitka:ussit, america/indiana/tell_city:ustel, america/indiana/winamac:uswlz, america/indiana/petersburg:uswsq, america/north_dakota/beulah:usxul, america/yakutat:usyak, etc/uct:utc, etc/universal:utc, etc/utc:utc, etc/zulu:utc, uct:utc, universal:utc, utc:utc, zulu:utc, etc/gmt-1:utce01, etc/gmt-2:utce02, etc/gmt-3:utce03, etc/gmt-4:utce04, etc/gmt-5:utce05, etc/gmt-6:utce06, etc/gmt-7:utce07, etc/gmt-8:utce08, etc/gmt-9:utce09, etc/gmt-10:utce10, etc/gmt-11:utce11, etc/gmt-12:utce12, etc/gmt-13:utce13, etc/gmt-14:utce14, etc/gmt+1:utcw01, etc/gmt+2:utcw02, etc/gmt+3:utcw03, etc/gmt+4:utcw04, etc/gmt+5:utcw05, etc/gmt+6:utcw06, etc/gmt+7:utcw07, etc/gmt+8:utcw08, etc/gmt+9:utcw09, etc/gmt+10:utcw10, etc/gmt+11:utcw11, etc/gmt+12:utcw12, america/montevideo:uymvd, asia/samarkand:uzskd, asia/tashkent:uztas, europe/vatican:vavat, america/st_vincent:vcsvd, america/caracas:veccs, america/tortola:vgtov, america/st_thomas:vistt, america/virgin:vistt, asia/ho_chi_minh:vnsgn, asia/saigon:vnsgn, pacific/efate:vuvli, pacific/wallis:wfmau, pacific/apia:wsapw, asia/aden:yeade, indian/mayotte:ytmam, africa/johannesburg:zajnb, africa/lusaka:zmlun, africa/harare:zwhre"), (byte[]) null)), new java.util.AbstractMap.SimpleImmutableEntry("variabletop", new defpackage.aogc((java.lang.Object) "vt", (java.lang.Object) defpackage.aihd.q(), (java.lang.Object) defpackage.aigf.j(), (byte[]) null)));
        E = defpackage.ahzf.b('-');
        F = defpackage.ahzf.b(';');
        G = defpackage.aigf.j();
        H = defpackage.aigf.j();
        defpackage.akff akffVarA = a("root");
        a = akffVarA;
        defpackage.akff akffVarA2 = a("und");
        b = akffVarA2;
        java.util.HashMap map = new java.util.HashMap();
        java.util.HashMap map2 = new java.util.HashMap();
        defpackage.akfa akfaVar = new defpackage.akfa(akffVarA, 2);
        map.put("", akfaVar);
        map2.put("", akffVarA);
        map.put("root", akfaVar);
        map2.put("root", akffVarA);
        map.put("und", new defpackage.akfa(akffVarA2, 2));
        map2.put("und", akffVarA2);
        for (java.lang.String str : defpackage.ahzf.b(',').h("en,en-US,en-us,fr,es,zh-CN,de,ja,ko,ru,ko-KR,it,pl,tr,en-GB,pt-BR,ja-JP,nl,de-DE,th,es-ES,en-gb,zh,fr-FR,pt-br,pt,de-de,zh-TW,ar,fr-fr,sv,es-es,id,zh-cn,vi,it-IT,hu,ru-RU,fi,ro,cs,tr-TR,el,pl-PL,da,nl-NL,no,it-it,en-AU,pt-PT,bg,sk,sv-SE,fa,es-mx,hr,iw,ca,lo,lt,es-MX,en-au,sr,en-CA,uk,tl,sl,es-419,da-DK,ru-ru,zh-tw,es-ar,lv,cy,en-ca,eo,tr-tr,de-CH,gl,et,ar-sa,uz,hu-hu,pt-pt,fi-FI,is-IS,he,th-TH,nl-BE,hi,es-AR,cs-CZ,fi-fi,en-IE,es-pe,sv-se,eu,ja-jp,de-AT,bg-BG,es-CO,fr-BE,fr-CA,sk-SK,el-GR,en-IN,hu-HU,ar-SA,nl-be,fr-ca,ar-eg,no-NO,mk,vi-VN,el-gr,es-co,ka,nb,nn,es-ve,es-CL,ro-RO,is,he-IL,hr-HR,fil,ms,sq,te,vi-vn,ml-IN,de-ch,de-at,es-cl,ro-ro,id-ID,ml,en-NZ,fr-be,br,nl-nl,en-nz,es-PE,nb-NO,lt-LT,th-th,ta,bs,az,sw,mr,be,af,uk-UA,en-ie,oc,es-VE,hr-hr,kr,tg-IN,ga,kn,gu-IN,gbk,lb,io,kn-IN,zh-Hans,en-ZA,my,jv,win,en-za,ar-EG,zh-HK,mn,be-TARASK,et-EE,zh-hk,sl-SI,la,sr-RS,fr-ch,*,fr-CH,en-in,hy,hi-IN,qu,en-SG,si,ht,new,lv-LV,ps,ur,mt,es-us,vo,gu,fo,es-EC,bn,en-us.,ak,us,mi-NZ,fa-IR,es-cr,ne,ab,en-sg,tt,es-US,en-MY,es-ec,da-dk,ar-ae,mi,su,ar-jo,ca-ES,kk,ar-kw,en-UK,km,ko-kr,sh,war,sr-rs,sr-cs,ar-AE,gl-ES,gd,nb-no,en-my,yo,fil-PH,en-BE,ar-iq,an,es-sv,am,et-ee,fy,zh-hant,sah,ar-KW,it-CH,ar-sy,kis,es-ES_tradnl,nds,es-gt,yue,es-pa,es-CR,scn,ast,ms-MY,pms,es-uy,ceb,ar-qa,es-do,lah,ar-JO,en-securid,pl-pl,pa,eng,en-ph,ar-IQ,zh_TW,co,ar-om,en-PH,es-GT,hk,ar-bh,dv,lmo,ar-ma,ia,iso,ar-dz,it-ch,es-DO,gsw,bo,q=0.5,zh-hans,es-PA,ar-QA,es-pr,ug,se,es-bo,rup,ksh,ee,bpy,es-SV,es-hn,ku,nan,vec,chrome://global/locale/intl.properties,nap,arz,fa-ir,ar-SY,es-HN,zh_CN,mk-MK,es-PR,yi,ar-OM,US,ar-ye,cv,map,lb-lu,li,bar,wa,es-UY,bat,sa,mo,ka-GE,pam,os,he-il,English,ar-BH,de-US,sr-Latn-RS,iw-IL,com,jw,ckb,ky,hsb,sr-SP,en-ID,ba,EN,ar-ly,sd,gv,nah,to,fr-MA,fr-LU,undefined,bn-IN,tk,vls,en-zw,ar-lb,bik,ir,zh-sg,sco,rm,fr-lu,*/*,nds-NL,bs-ba,arc,zza,en-DE,en-TV,es-ni,mg,xal,Chinese,ar-LB,es-py,hif,al,ang,chm,fiu,kw,es-BO,pi,glk,all,JA,ca-es,en-tt,wuu,sv-fi,es-PY,szl,nn-no,cs-cz,frp,ar-LY,bh,hy-AM,chr,sc,null,sq-AL,fur,en-HK,en_US,krc,nov,ilo,haw,nn-NO,or,lij,et-ET,ar-DZ,nrm,ar-MA,hy-LB,es-NI,kk-KZ,iu,lad,esl-ES,gn,en-TH,en-LV,roa,csb,so,ga-IE,tn,en-AE,dsb,en-029,stq,bs-Latn-BA,ua,ar-YE,be-BY,dz,en-TT,gd-GB,crh-Latn,wo,mwl,sv-FI,nv,zh-mo,eu-ES,zh-SG,hr-BA,sk-sk,ln,de-lu,ga-ie,ext,hr-ba,mt-MT,as,ace,es-LA,hak,ca-US,de-LU,cbk,en-ZW,mzn,ay,vn,tg,ce,fi-MH,pdc,kv,en-ES,kk-Arab,en-NO,------defaultChoice,pl-US,FR,pag,sr-Latn-CS,gh,zu,tpi,ar-tn,ch,jbo,gal-ES,es-xl,bjn,ie,mm,gae-IE,no-no,en-jm,myv,kl,zh-CH,en-IT,cu,az-AZ,zh-Cn,xx-elmer,kab,af-za,ig,sr-LT,sr-ba,hl,zh-Hant,us-EN,gl-gl,lt-lt,zea,x-ns2H8e0NniiOc6,x-ns1A54hMPT6Nhv,pap,fr-mc,xx-bork,bg-bg,pcd,sjd,tum,fj,udm,eN,GB,sv-US,sr-YU,lb-LU,fr-US,se-SE,frr,kaa,DE,ti,koi,ty,in,cr,kg,en-bz,cn,bs-BA,sl-si,CA,de-li,sr-Cyrl-RS,x-ns2Ud00Nnym7b6,ru-UA,ta-IN,xx-hacker,pt-US,en-RO,na,mdf,ar-TN,xh,za,tet,ha,x-ns1QWkLoWvlNhL,de-LI,f,sm,bm,rom,sr-ME,ny,zh-US,cdo,uk-ua,en-BR,en-DK,ks,srn,ss,en-FI,fr-DZ,ru-KZ,fr-MC,af-ZA,sg,ng,iu-CA,xx-pirate,cy-GB,gl-GL")) {
            try {
                defpackage.akff akffVarA3 = a(str);
                defpackage.akfa akfaVar2 = new defpackage.akfa(akffVarA3, 2);
                map.put(str, akfaVar2);
                map.put(akffVarA3.q, akfaVar2);
            } catch (defpackage.akfb e2) {
                map.put(str, new defpackage.akfa(e2, 1));
            } catch (defpackage.akfc e3) {
                map.put(str, new defpackage.akfa(e3, 0));
            }
            defpackage.akff akffVarB = b(str);
            map2.put(str, akffVarB);
            map2.put(akffVarB.q, akffVarB);
        }
        G = defpackage.aigf.i(map);
        H = defpackage.aigf.i(map2);
        a("af");
        a("ak");
        a("sq");
        a("am");
        a("ar");
        a("hy");
        a("az");
        a("eu");
        a("be");
        a("bn");
        a("bs");
        c = a("pt-BR");
        a("en-GB");
        a("bg");
        a("my");
        a("en-CA");
        a("fr-CA");
        a("yue");
        a("ca");
        a("ceb");
        a("chr");
        a("zh-Hans-CN");
        a("zh-CN");
        a("zh-Hans-CN");
        a("zh");
        a("zh-Hans");
        a("zh-Hant");
        a("hr");
        a("cs");
        a("da");
        a("nl");
        d = a("en");
        a("en-CA");
        e = a("en-GB");
        f = a("en-US");
        a("eo");
        a("et");
        a("fil");
        a("fi");
        g = a("fr-FR");
        a("fr");
        h = a("fr-CA");
        a("fr-FR");
        a("gl");
        a("ka");
        a("de");
        i = a("de-DE");
        a("de-DE");
        a("el");
        a("gu");
        a("ht");
        a("ha");
        a("haw");
        a("iw");
        a("hi");
        a("hmn");
        a("zh-HK");
        a("zh-Hant-HK");
        a("hu");
        a("is");
        a("ig");
        j = a("id");
        a("ga");
        a("it");
        a("it-IT");
        k = a("it-IT");
        l = a("ja-JP");
        m = a("ja");
        n = a("ja-JP");
        a("jv");
        a("kn");
        a("kk");
        a("km");
        a("ko-KR");
        a("ko");
        a("ko-KR");
        a("lo");
        a("la");
        a("lv");
        a("lt");
        a("lb");
        a("mk");
        a("mg");
        a("ms");
        a("ml");
        a("mt");
        a("mi");
        a("mr");
        a("mfe");
        a("mn");
        a("sr-ME");
        a("ne");
        a("no");
        a("zxx");
        a("ny");
        a("or");
        a("fa");
        o = a("pl");
        a("pt-PT");
        a("pt");
        a("pa");
        a("ro");
        a("ru");
        a("gd");
        a("sr");
        a("st");
        a("si");
        a("sk");
        a("sl");
        a("so");
        a("es");
        a("es-419");
        a("su");
        a("sw");
        a("sv");
        a("zh-TW");
        a("zh-Hant-TW");
        a("tg");
        a("ta");
        a("te");
        a("th");
        a("tr");
        a("en-GB");
        a("uk");
        a("ur");
        p = a("en-US");
        a("uz");
        a("vi");
        a("cy");
        a("yi");
        a("yo");
        a("zu");
    }

    private akff(java.lang.String str, int i2, int i3) {
        int length;
        java.util.Map map;
        java.lang.String str2;
        this.K = new java.util.ArrayList();
        l(str, i2, i3);
        this.K = this.K.isEmpty() ? null : j$.util.DesugarCollections.unmodifiableList(this.K);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String str3 = this.I;
        if (str3 != null) {
            sb.append(str3);
        }
        if (this.P != 0) {
            length = sb.length();
            sb.append('-');
            switch (this.P) {
                case 1:
                    str2 = "Adlm";
                    break;
                case 2:
                    str2 = "Afak";
                    break;
                case 3:
                    str2 = "Aghb";
                    break;
                case 4:
                    str2 = "Ahom";
                    break;
                case 5:
                    str2 = "Arab";
                    break;
                case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                    str2 = "Aran";
                    break;
                case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                    str2 = "Armi";
                    break;
                case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                    str2 = "Armn";
                    break;
                case 9:
                    str2 = "Avst";
                    break;
                case 10:
                    str2 = "Bali";
                    break;
                case 11:
                    str2 = "Bamu";
                    break;
                case 12:
                    str2 = "Bass";
                    break;
                case 13:
                    str2 = "Batk";
                    break;
                case 14:
                    str2 = "Beng";
                    break;
                case 15:
                    str2 = "Berf";
                    break;
                case 16:
                    str2 = "Bhks";
                    break;
                case 17:
                    str2 = "Blis";
                    break;
                case 18:
                    str2 = "Bopo";
                    break;
                case 19:
                    str2 = "Brah";
                    break;
                case 20:
                    str2 = "Brai";
                    break;
                case 21:
                    str2 = "Bugi";
                    break;
                case 22:
                    str2 = "Buhd";
                    break;
                case 23:
                    str2 = "Cakm";
                    break;
                case 24:
                    str2 = "Cans";
                    break;
                case 25:
                    str2 = "Cari";
                    break;
                case 26:
                    str2 = "Cham";
                    break;
                case 27:
                    str2 = "Cher";
                    break;
                case 28:
                    str2 = "Chrs";
                    break;
                case 29:
                    str2 = "Cirt";
                    break;
                case 30:
                    str2 = "Copt";
                    break;
                case 31:
                    str2 = "Cpmn";
                    break;
                case 32:
                    str2 = "Cprt";
                    break;
                case 33:
                    str2 = "Cyrl";
                    break;
                case 34:
                    str2 = "Cyrs";
                    break;
                case 35:
                    str2 = "Deva";
                    break;
                case 36:
                    str2 = "Diak";
                    break;
                case 37:
                    str2 = "Dogr";
                    break;
                case 38:
                    str2 = "Dsrt";
                    break;
                case 39:
                    str2 = "Dupl";
                    break;
                case 40:
                    str2 = "Egyd";
                    break;
                case 41:
                    str2 = "Egyh";
                    break;
                case 42:
                    str2 = "Egyp";
                    break;
                case 43:
                    str2 = "Elba";
                    break;
                case 44:
                    str2 = "Elym";
                    break;
                case 45:
                    str2 = "Ethi";
                    break;
                case 46:
                    str2 = "Gara";
                    break;
                case 47:
                    str2 = "Geok";
                    break;
                case 48:
                    str2 = "Geor";
                    break;
                case 49:
                    str2 = "Glag";
                    break;
                case 50:
                    str2 = "Gong";
                    break;
                case 51:
                    str2 = "Gonm";
                    break;
                case 52:
                    str2 = "Goth";
                    break;
                case 53:
                    str2 = "Gran";
                    break;
                case 54:
                    str2 = "Grek";
                    break;
                case 55:
                    str2 = "Gujr";
                    break;
                case 56:
                    str2 = "Gukh";
                    break;
                case 57:
                    str2 = "Guru";
                    break;
                case 58:
                    str2 = "Hanb";
                    break;
                case 59:
                    str2 = "Hang";
                    break;
                case 60:
                    str2 = "Hani";
                    break;
                case 61:
                    str2 = "Hano";
                    break;
                case 62:
                    str2 = "Hans";
                    break;
                case 63:
                    str2 = "Hant";
                    break;
                case 64:
                    str2 = "Hatr";
                    break;
                case 65:
                    str2 = "Hebr";
                    break;
                case 66:
                    str2 = "Hira";
                    break;
                case 67:
                    str2 = "Hluw";
                    break;
                case 68:
                    str2 = "Hmng";
                    break;
                case 69:
                    str2 = "Hmnp";
                    break;
                case 70:
                    str2 = "Hntl";
                    break;
                case 71:
                    str2 = "Hrkt";
                    break;
                case 72:
                    str2 = "Hung";
                    break;
                case 73:
                    str2 = "Inds";
                    break;
                case 74:
                    str2 = "Ital";
                    break;
                case 75:
                    str2 = "Jamo";
                    break;
                case 76:
                    str2 = "Java";
                    break;
                case 77:
                    str2 = "Jpan";
                    break;
                case 78:
                    str2 = "Jurc";
                    break;
                case 79:
                    str2 = "Kali";
                    break;
                case 80:
                    str2 = "Kana";
                    break;
                case 81:
                    str2 = "Kawi";
                    break;
                case 82:
                    str2 = "Khar";
                    break;
                case 83:
                    str2 = "Khmr";
                    break;
                case 84:
                    str2 = "Khoj";
                    break;
                case 85:
                    str2 = "Kits";
                    break;
                case 86:
                    str2 = "Knda";
                    break;
                case 87:
                    str2 = "Kore";
                    break;
                case 88:
                    str2 = "Kpel";
                    break;
                case 89:
                    str2 = "Krai";
                    break;
                case 90:
                    str2 = "Kthi";
                    break;
                case 91:
                    str2 = "Lana";
                    break;
                case 92:
                    str2 = "Laoo";
                    break;
                case 93:
                    str2 = "Latf";
                    break;
                case 94:
                    str2 = "Latg";
                    break;
                case 95:
                    str2 = "Latn";
                    break;
                case 96:
                    str2 = "Lepc";
                    break;
                case 97:
                    str2 = "Limb";
                    break;
                case 98:
                    str2 = "Lina";
                    break;
                case 99:
                    str2 = "Linb";
                    break;
                case 100:
                    str2 = "Lisu";
                    break;
                case 101:
                    str2 = "Loma";
                    break;
                case 102:
                    str2 = "Lyci";
                    break;
                case 103:
                    str2 = "Lydi";
                    break;
                case 104:
                    str2 = "Mahj";
                    break;
                case 105:
                    str2 = "Maka";
                    break;
                case 106:
                    str2 = "Mand";
                    break;
                case 107:
                    str2 = "Mani";
                    break;
                case 108:
                    str2 = "Marc";
                    break;
                case 109:
                    str2 = "Maya";
                    break;
                case 110:
                    str2 = "Medf";
                    break;
                case 111:
                    str2 = "Mend";
                    break;
                case 112:
                    str2 = "Merc";
                    break;
                case 113:
                    str2 = "Mero";
                    break;
                case 114:
                    str2 = "Mlym";
                    break;
                case 115:
                    str2 = "Modi";
                    break;
                case 116:
                    str2 = "Mong";
                    break;
                case 117:
                    str2 = "Moon";
                    break;
                case 118:
                    str2 = "Mroo";
                    break;
                case 119:
                    str2 = "Mtei";
                    break;
                case 120:
                    str2 = "Mult";
                    break;
                case 121:
                    str2 = "Mymr";
                    break;
                case 122:
                    str2 = "Nagm";
                    break;
                case 123:
                    str2 = "Nand";
                    break;
                case 124:
                    str2 = "Narb";
                    break;
                case 125:
                    str2 = "Nbat";
                    break;
                case 126:
                    str2 = "Newa";
                    break;
                case 127:
                    str2 = "Nkgb";
                    break;
                case 128:
                    str2 = "Nkoo";
                    break;
                case 129:
                    str2 = "Nshu";
                    break;
                case 130:
                    str2 = "Ogam";
                    break;
                case 131:
                    str2 = "Olck";
                    break;
                case 132:
                    str2 = "Onao";
                    break;
                case 133:
                    str2 = "Orkh";
                    break;
                case 134:
                    str2 = "Orya";
                    break;
                case 135:
                    str2 = "Osge";
                    break;
                case 136:
                    str2 = "Osma";
                    break;
                case 137:
                    str2 = "Ougr";
                    break;
                case 138:
                    str2 = "Palm";
                    break;
                case 139:
                    str2 = "Pauc";
                    break;
                case 140:
                    str2 = "Perm";
                    break;
                case 141:
                    str2 = "Phag";
                    break;
                case 142:
                    str2 = "Phli";
                    break;
                case 143:
                    str2 = "Phlp";
                    break;
                case 144:
                    str2 = "Phlv";
                    break;
                case 145:
                    str2 = "Phnx";
                    break;
                case 146:
                    str2 = "Plrd";
                    break;
                case 147:
                    str2 = "Prti";
                    break;
                case 148:
                    str2 = "Rjng";
                    break;
                case 149:
                    str2 = "Rohg";
                    break;
                case 150:
                    str2 = "Roro";
                    break;
                case 151:
                    str2 = "Runr";
                    break;
                case 152:
                    str2 = "Samr";
                    break;
                case 153:
                    str2 = "Sara";
                    break;
                case 154:
                    str2 = "Sarb";
                    break;
                case 155:
                    str2 = "Saur";
                    break;
                case 156:
                    str2 = "Sgnw";
                    break;
                case 157:
                    str2 = "Shaw";
                    break;
                case 158:
                    str2 = "Shrd";
                    break;
                case 159:
                    str2 = "Sidd";
                    break;
                case 160:
                    str2 = "Sidt";
                    break;
                case 161:
                    str2 = "Sind";
                    break;
                case 162:
                    str2 = "Sinh";
                    break;
                case 163:
                    str2 = "Sogd";
                    break;
                case 164:
                    str2 = "Sogo";
                    break;
                case 165:
                    str2 = "Sora";
                    break;
                case 166:
                    str2 = "Soyo";
                    break;
                case 167:
                    str2 = "Sund";
                    break;
                case 168:
                    str2 = "Sunu";
                    break;
                case 169:
                    str2 = "Sylo";
                    break;
                case 170:
                    str2 = "Syrc";
                    break;
                case 171:
                    str2 = "Syre";
                    break;
                case 172:
                    str2 = "Syrj";
                    break;
                case 173:
                    str2 = "Syrn";
                    break;
                case 174:
                    str2 = "Tagb";
                    break;
                case 175:
                    str2 = "Takr";
                    break;
                case 176:
                    str2 = "Tale";
                    break;
                case 177:
                    str2 = "Talu";
                    break;
                case 178:
                    str2 = "Taml";
                    break;
                case 179:
                    str2 = "Tang";
                    break;
                case 180:
                    str2 = "Tavt";
                    break;
                case 181:
                    str2 = "Tayo";
                    break;
                case 182:
                    str2 = "Telu";
                    break;
                case 183:
                    str2 = "Teng";
                    break;
                case 184:
                    str2 = "Tfng";
                    break;
                case 185:
                    str2 = "Tglg";
                    break;
                case 186:
                    str2 = "Thaa";
                    break;
                case 187:
                    str2 = "Thai";
                    break;
                case 188:
                    str2 = "Tibt";
                    break;
                case 189:
                    str2 = "Tirh";
                    break;
                case 190:
                    str2 = "Tnsa";
                    break;
                case 191:
                    str2 = "Todr";
                    break;
                case 192:
                    str2 = "Tols";
                    break;
                case 193:
                    str2 = "Toto";
                    break;
                case 194:
                    str2 = "Tutg";
                    break;
                case 195:
                    str2 = "Ugar";
                    break;
                case 196:
                    str2 = "Vaii";
                    break;
                case 197:
                    str2 = "Visp";
                    break;
                case 198:
                    str2 = "Vith";
                    break;
                case 199:
                    str2 = "Wara";
                    break;
                case 200:
                    str2 = "Wcho";
                    break;
                case 201:
                    str2 = "Wole";
                    break;
                case 202:
                    str2 = "Xpeo";
                    break;
                case 203:
                    str2 = "Xsux";
                    break;
                case 204:
                    str2 = "Yezi";
                    break;
                case 205:
                    str2 = "Yiii";
                    break;
                case 206:
                    str2 = "Zanb";
                    break;
                case 207:
                    str2 = "Zinh";
                    break;
                case 208:
                    str2 = "Zmth";
                    break;
                case 209:
                    str2 = "Zsye";
                    break;
                case 210:
                    str2 = "Zsym";
                    break;
                case 211:
                    str2 = "Zxxx";
                    break;
                case 212:
                    str2 = "Zyyy";
                    break;
                case 213:
                    str2 = "Zzzz";
                    break;
                default:
                    str2 = "null";
                    break;
            }
            sb.append((java.lang.Object) str2);
        } else {
            length = 0;
        }
        if (this.J != null) {
            length = sb.length();
            sb.append('-');
            sb.append(this.J);
        }
        if (this.K != null) {
            length = sb.length();
            for (java.lang.String str4 : this.K) {
                sb.append('-');
                sb.append(str4);
            }
        }
        int length2 = sb.length();
        if (this.L != null || ((map = this.M) != null && !map.isEmpty())) {
            sb.append("-t");
            if (this.L != null) {
                sb.append('-');
                sb.append(this.L);
            }
            java.util.Map map2 = this.M;
            if (map2 != null) {
                for (java.util.Map.Entry entry : map2.entrySet()) {
                    sb.append('-');
                    sb.append((java.lang.String) entry.getKey());
                    if (!((java.lang.String) entry.getValue()).isEmpty()) {
                        sb.append('-');
                        sb.append((java.lang.String) entry.getValue());
                    }
                }
            }
        }
        java.util.Map map3 = this.N;
        if (map3 != null && !map3.isEmpty()) {
            sb.append("-u");
            for (java.util.Map.Entry entry2 : this.N.entrySet()) {
                sb.append('-');
                sb.append((java.lang.String) entry2.getKey());
                if (!((java.lang.String) entry2.getValue()).isEmpty()) {
                    sb.append('-');
                    sb.append((java.lang.String) entry2.getValue());
                }
            }
        }
        java.lang.String str5 = this.O;
        if (str5 != null && !str5.isEmpty()) {
            sb.append("-x-");
            sb.append(this.O);
        }
        this.q = sb.toString();
        if (length != 0) {
            this.r = h(d(java.lang.String.valueOf(sb.substring(0, length)).concat(java.lang.String.valueOf(sb.substring(length2)))));
        } else {
            if (j$.util.Objects.equals(this.I, "root")) {
                return;
            }
            this.r = a;
        }
    }

    public static defpackage.akff a(java.lang.String str) {
        return f(d(str), 2);
    }

    public static defpackage.akff b(java.lang.String str) {
        return !x.h(str) ? b : f(d(str), 1);
    }

    public static java.lang.String d(java.lang.String str) {
        if (x.h(str)) {
            return defpackage.ahvr.p(str).replace('_', '-').replace(',', ';');
        }
        throw new defpackage.akfb("Illegal characters in language tag: ".concat(java.lang.String.valueOf(str)));
    }

    public static defpackage.akff f(java.lang.String str, int i2) {
        defpackage.akff akffVarK;
        defpackage.akff akffVarK2 = k(str, i2);
        if (akffVarK2 != null) {
            return akffVarK2;
        }
        java.lang.String strD = d(str);
        return (strD.equals(str) || (akffVarK = k(strD, i2)) == null) ? new defpackage.akff(str, 1, i2) : akffVarK;
    }

    private static defpackage.aigf g(java.lang.String str) {
        defpackage.aigb aigbVar = new defpackage.aigb(4);
        for (java.lang.String str2 : str.split(",\\s*", -1)) {
            java.lang.String[] strArrSplit = str2.split(":", 2);
            aigbVar.i(strArrSplit[0], strArrSplit[1]);
        }
        return aigbVar.e(true);
    }

    private static defpackage.akff h(java.lang.String str) {
        defpackage.akff akffVarF = f(str, 2);
        return (defpackage.ahvr.p(akffVarF.q).equals(str) || y.containsKey(str)) ? akffVarF : new defpackage.akff(str, 2, 2);
    }

    private static void i(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        throw new defpackage.akfb(str2 + ": " + str + " in: " + str3);
    }

    private static boolean j(java.lang.String str) {
        int iCharAt;
        int length = str.length();
        if (length == 2) {
            iCharAt = ((str.charAt(0) - 'a') * 26) + (str.charAt(1) - 'a');
        } else if (length == 3) {
            iCharAt = ((str.charAt(0) - 'a') * 676) + ((str.charAt(1) - 'a') * 26) + (str.charAt(2) - 'a') + 676;
        } else {
            int length2 = z.length;
            iCharAt = 18240;
        }
        long[] jArr = z;
        int length3 = jArr.length;
        int i2 = iCharAt >> 6;
        return i2 < 285 && (jArr[i2] & (1 << (iCharAt % 64))) != 0;
    }

    private static defpackage.akff k(java.lang.String str, int i2) {
        if (i2 != 2) {
            return (defpackage.akff) H.get(str);
        }
        defpackage.akfd akfdVar = (defpackage.akfd) G.get(str);
        if (akfdVar == null) {
            return null;
        }
        return akfdVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:173:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:243:0x03e8 A[PHI: r12 r19
      0x03e8: PHI (r12v15 boolean) = (r12v14 boolean), (r12v25 boolean) binds: [B:242:0x03e6, B:227:0x03a5] A[DONT_GENERATE, DONT_INLINE]
      0x03e8: PHI (r19v1 int) = (r19v0 int), (r19v5 int) binds: [B:242:0x03e6, B:227:0x03a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:244:0x03ea A[PHI: r12 r19
      0x03ea: PHI (r12v21 boolean) = (r12v14 boolean), (r12v25 boolean) binds: [B:242:0x03e6, B:227:0x03a5] A[DONT_GENERATE, DONT_INLINE]
      0x03ea: PHI (r19v3 int) = (r19v0 int), (r19v5 int) binds: [B:242:0x03e6, B:227:0x03a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:246:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:248:0x03f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:249:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:250:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:251:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:254:0x03fe A[EDGE_INSN: B:254:0x03fe->B:275:0x0449 BREAK  A[LOOP:5: B:215:0x0385->B:481:0x0385]] */
    /* JADX WARN: Code duplicated, block: B:257:0x0411  */
    /* JADX WARN: Code duplicated, block: B:259:0x0414  */
    /* JADX WARN: Code duplicated, block: B:260:0x0416  */
    /* JADX WARN: Code duplicated, block: B:265:0x0434  */
    /* JADX WARN: Code duplicated, block: B:267:0x0437  */
    /* JADX WARN: Code duplicated, block: B:268:0x0439 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:269:0x043b  */
    /* JADX WARN: Code duplicated, block: B:469:0x0401 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:475:0x0445 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:476:0x0441 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:478:0x0447 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:479:0x03fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:480:0x043e A[SYNTHETIC] */
    private final void l(java.lang.String str, int i2, int i3) {
        int i4;
        int i5;
        boolean z2;
        int i6;
        char cCharAt;
        int i7;
        int length;
        int i8;
        int i9;
        java.lang.String strSubstring;
        int length2;
        int i10;
        boolean z3;
        boolean z4;
        char cCharAt2;
        java.lang.String strSubstring2 = str;
        int i11 = 1;
        if (i3 == 1) {
            this.I = "und";
        }
        if (strSubstring2.isEmpty()) {
            if (i3 != 1) {
                throw new defpackage.akfb("Language tag cannot be empty");
            }
            return;
        }
        if (strSubstring2.startsWith("und-")) {
            java.lang.String strSubstring3 = strSubstring2.substring(4);
            if (s.contains(strSubstring3)) {
                strSubstring2 = strSubstring3;
            }
        }
        int length3 = strSubstring2.length();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i4 = 45;
            i5 = -1;
            if (i13 >= length3) {
                i13 = -1;
                break;
            }
            char cCharAt3 = strSubstring2.charAt(i13);
            if (cCharAt3 == '@') {
                break;
            }
            int i14 = i13 + 1;
            if (cCharAt3 == '-' && i13 + 3 <= length3 && ((((cCharAt2 = strSubstring2.charAt(i14)) >= '0' && cCharAt2 <= '9') || (cCharAt2 >= 'a' && cCharAt2 <= 'z')) && strSubstring2.charAt(i13 + 2) == '-')) {
                break;
            } else {
                i13 = i14;
            }
        }
        if (i13 == -1) {
            z2 = false;
            i13 = -1;
        } else if (i13 == 0) {
            if (i3 != 1) {
                throw new defpackage.akfc("Missing language subtag: ".concat(java.lang.String.valueOf(strSubstring2)));
            }
            return;
        } else if (strSubstring2.charAt(i13) != '-') {
            z2 = true;
        } else {
            if (strSubstring2.indexOf(64, i13 + 3) != -1) {
                if (i3 != 1) {
                    throw new defpackage.akfc("Mixed old CLDR and BCP-47 syntax: ".concat(java.lang.String.valueOf(strSubstring2)));
                }
                return;
            }
            z2 = false;
        }
        int i15 = 2;
        if (i13 != -1) {
            int i16 = i13 + 1;
            if (z2) {
                java.lang.String strSubstring4 = strSubstring2.substring(i16);
                this.N = new java.util.TreeMap();
                java.util.Iterator it = F.h(strSubstring4).iterator();
                while (true) {
                    if (it.hasNext()) {
                        java.lang.String str2 = (java.lang.String) it.next();
                        java.util.List listJ = defpackage.ahzf.b('=').j(str2);
                        if (listJ.size() == i15) {
                            java.lang.String str3 = (java.lang.String) listJ.get(i12);
                            defpackage.aigf aigfVar = D;
                            defpackage.aogc aogcVar = (defpackage.aogc) aigfVar.get(str3);
                            if (aogcVar != null) {
                                java.lang.String str4 = (java.lang.String) listJ.get(i11);
                                java.lang.String str5 = (java.lang.String) ((defpackage.aigf) aogcVar.c).get(str4);
                                java.lang.Object obj = aogcVar.a;
                                if (str5 != null) {
                                    str4 = str5;
                                } else if (((defpackage.aihd) aogcVar.b).contains(str4)) {
                                    continue;
                                } else {
                                    java.lang.String str6 = (java.lang.String) obj;
                                    if (!str6.equals("kr") || str4.length() == 0) {
                                        if (str6.equals("vt") && str4.length() != 0) {
                                            java.util.Iterator it2 = E.h(str4).iterator();
                                            while (true) {
                                                if (it2.hasNext()) {
                                                    java.lang.String str7 = (java.lang.String) it2.next();
                                                    if (str7.length() < 4 || str7.length() > 6 || !v.h(str7) || java.lang.Integer.parseInt(str7, 16) > 1114111) {
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        }
                                        if (i3 == 2) {
                                            throw new defpackage.akfb(defpackage.hgb.n(strSubstring4, str4, "Unknown keyword value: ", " in: "));
                                        }
                                    } else {
                                        defpackage.aogc aogcVar2 = (defpackage.aogc) j$.util.Objects.requireNonNull((defpackage.aogc) aigfVar.get("colreorder"));
                                        for (java.lang.String str8 : E.h(str4)) {
                                            if (!str8.equals("others") && !((defpackage.aihd) aogcVar2.b).contains(str8)) {
                                                try {
                                                    defpackage.ajsz.X(defpackage.ahvr.o(str8.charAt(i12)) + str8.substring(1));
                                                    i12 = 0;
                                                } catch (java.lang.IllegalArgumentException unused) {
                                                }
                                            }
                                        }
                                    }
                                }
                                this.N.put(obj, str4);
                                i11 = 1;
                                i12 = 0;
                                i15 = 2;
                            } else if (i3 == i15) {
                                throw new defpackage.akfb(defpackage.hgb.n(strSubstring4, str3, "Unknown key: ", " in: "));
                            }
                        } else if (i3 == i15) {
                            throw new defpackage.akfb(defpackage.hgb.n(strSubstring4, str2, "Illegal key=value pair: ", " in: "));
                        }
                    }
                    this.N = j$.util.DesugarCollections.unmodifiableMap(this.N);
                }
            } else {
                while (i16 != i5) {
                    if (i16 == strSubstring2.length() + i5) {
                        if (i3 == 2) {
                            throw new defpackage.akfb("Truncated extension: ".concat(java.lang.String.valueOf(strSubstring2)));
                        }
                        break;
                    }
                    char cCharAt4 = strSubstring2.charAt(i16);
                    if (cCharAt4 != 't') {
                        if (cCharAt4 == 'u') {
                            int i17 = i16 + 2;
                            if (this.N == null) {
                                this.N = new java.util.TreeMap();
                                int i18 = i5;
                                int i19 = i18;
                                int i20 = i17;
                                int iIndexOf = 0;
                                while (true) {
                                    if (i20 == i5) {
                                        length = i5;
                                    } else {
                                        iIndexOf = strSubstring2.indexOf(i4, i20);
                                        length = (iIndexOf == i5 ? strSubstring2.length() : iIndexOf) - i20;
                                    }
                                    if (i18 == i5 || (i20 != i5 && length > 2)) {
                                        i8 = i5;
                                    } else {
                                        java.lang.String strSubstring5 = strSubstring2.substring(i18, i18 + 2);
                                        if (i19 == i5) {
                                            strSubstring = "";
                                        } else {
                                            int length4 = (i20 == i5 ? strSubstring2.length() : i20 - 1) - i19;
                                            if (length4 == 4) {
                                                if ("true".regionMatches(0, strSubstring2, i19, 4)) {
                                                    strSubstring = "";
                                                } else {
                                                    length4 = 4;
                                                }
                                            }
                                            strSubstring = strSubstring2.substring(i19, length4 + i19);
                                        }
                                        this.N.put(strSubstring5, strSubstring);
                                        i8 = -1;
                                    }
                                    if (i20 == i8) {
                                        break;
                                    }
                                    if (length == 0) {
                                        if (i3 == 2) {
                                            throw new defpackage.akfb("Empty -u- key in: ".concat(java.lang.String.valueOf(strSubstring2)));
                                        }
                                        i20 = -1;
                                        break;
                                    }
                                    if (length == 1) {
                                        break;
                                    }
                                    if (length == 2) {
                                        i18 = i20;
                                        i19 = -1;
                                        i9 = -1;
                                    } else {
                                        i9 = -1;
                                        if (i18 == -1) {
                                            if (i3 == 2) {
                                                throw new defpackage.akfb("Unsupported use of attributes: ".concat(java.lang.String.valueOf(strSubstring2)));
                                            }
                                            i20 = -1;
                                            break;
                                        } else if (i19 == -1) {
                                            i19 = i20;
                                        }
                                    }
                                    i20 = iIndexOf == i9 ? -1 : iIndexOf + 1;
                                    i4 = 45;
                                    i5 = -1;
                                }
                                if (i20 != i17) {
                                    i16 = i20;
                                } else {
                                    if (i3 == 2) {
                                        throw new defpackage.akfb("No valid subtag found after -u- in: ".concat(java.lang.String.valueOf(strSubstring2)));
                                    }
                                    i16 = -1;
                                }
                                this.N = j$.util.DesugarCollections.unmodifiableMap(this.N);
                                i4 = 45;
                                i5 = -1;
                            } else if (i3 != 1) {
                                throw new defpackage.akfb("More than one -u- in: ".concat(java.lang.String.valueOf(strSubstring2)));
                            }
                        } else {
                            if (cCharAt4 != 'x') {
                                if (i3 != 1) {
                                    throw new defpackage.akfc("Unsupported singleton in: ".concat(java.lang.String.valueOf(strSubstring2)));
                                }
                                break;
                            }
                            int i21 = i16 + 2;
                            int i22 = i21;
                            while (true) {
                                if (i22 == i5) {
                                    this.O = strSubstring2.substring(i21);
                                    break;
                                }
                                int iIndexOf2 = strSubstring2.indexOf(i4, i22);
                                if (iIndexOf2 == i5) {
                                    iIndexOf2 = strSubstring2.length();
                                    i7 = i5;
                                } else {
                                    i7 = iIndexOf2;
                                }
                                int i23 = iIndexOf2 - i22;
                                if (i23 <= 0 || i23 > 8) {
                                    if (i3 != 1) {
                                        throw new defpackage.akfb("Malformed subtag in: ".concat(java.lang.String.valueOf(strSubstring2)));
                                    }
                                    break;
                                }
                                i22 = i7 == i5 ? i5 : i7 + 1;
                            }
                        }
                        i16 = i5;
                    } else {
                        int i24 = i16 + 2;
                        if (this.M == null) {
                            this.M = new java.util.TreeMap();
                            int i25 = i24;
                            int i26 = -1;
                            int i27 = -1;
                            int i28 = -1;
                            int iIndexOf3 = 0;
                            int i29 = -1;
                            while (true) {
                                if (i25 == i29) {
                                    length2 = i29;
                                } else {
                                    iIndexOf3 = strSubstring2.indexOf(45, i25);
                                    length2 = (iIndexOf3 == i29 ? strSubstring2.length() : iIndexOf3) - i25;
                                }
                                if (i26 != i29) {
                                    if (i25 == i29 || length2 <= 2) {
                                        if (i27 == i29) {
                                            if (i3 == 2) {
                                                throw new defpackage.akfb("Transform option without value in: ".concat(java.lang.String.valueOf(strSubstring2)));
                                            }
                                            i25 = i29;
                                            break;
                                        }
                                        z4 = i25 != i29;
                                        i10 = i28;
                                        this.M.put(strSubstring2.substring(i26, i26 + 2), strSubstring2.substring(i27, ((i25 == i29 ? strSubstring2.length() : i25 - 1) - i27) + i27));
                                        i29 = -1;
                                        z3 = true;
                                        if (z3 != z4) {
                                            i28 = i10;
                                            break;
                                        }
                                        if (i10 != 0) {
                                            i28 = i10;
                                        } else if (length2 <= 2) {
                                            i28 = (i25 - i24) + i29;
                                        } else {
                                            i28 = 0;
                                        }
                                        if (length2 == 0) {
                                            if (i3 == 2) {
                                                throw new defpackage.akfb("Empty -t- subtag in: ".concat(java.lang.String.valueOf(strSubstring2)));
                                            }
                                            i29 = -1;
                                            i25 = -1;
                                            break;
                                        }
                                        if (length2 == 1) {
                                            i29 = -1;
                                            break;
                                        }
                                        if (length2 != 2 && t.c(strSubstring2.charAt(i25)) && u.c(strSubstring2.charAt(i25 + 1))) {
                                            i26 = i25;
                                            i27 = -1;
                                            i29 = -1;
                                        } else {
                                            i29 = -1;
                                            if (i26 == -1) {
                                                i28 = 0;
                                            } else if (i27 == -1) {
                                                i27 = i25;
                                            }
                                        }
                                        i25 = iIndexOf3 == i29 ? i29 : iIndexOf3 + 1;
                                    } else {
                                        i10 = i28;
                                        z3 = true;
                                        if (i25 == i29) {
                                            z4 = false;
                                        } else {
                                            z4 = true;
                                        }
                                        if (z3 != z4) {
                                            i28 = i10;
                                            break;
                                        }
                                        if (i10 != 0) {
                                            i28 = i10;
                                        } else if (length2 <= 2) {
                                            i28 = (i25 - i24) + i29;
                                        } else {
                                            i28 = 0;
                                        }
                                        if (length2 == 0) {
                                            if (i3 == 2) {
                                                throw new defpackage.akfb("Empty -t- subtag in: ".concat(java.lang.String.valueOf(strSubstring2)));
                                            }
                                            i29 = -1;
                                            i25 = -1;
                                            break;
                                        }
                                        if (length2 == 1) {
                                            i29 = -1;
                                            break;
                                        }
                                        if (length2 != 2) {
                                            i29 = -1;
                                            if (i26 == -1) {
                                                i28 = 0;
                                            } else if (i27 == -1) {
                                                i27 = i25;
                                            }
                                        } else {
                                            i29 = -1;
                                            if (i26 == -1) {
                                                i28 = 0;
                                            } else if (i27 == -1) {
                                                i27 = i25;
                                            }
                                        }
                                        if (iIndexOf3 == i29) {
                                        }
                                    }
                                } else {
                                    i10 = i28;
                                    z3 = true;
                                    if (i25 == i29) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    if (z3 != z4) {
                                        i28 = i10;
                                        break;
                                    }
                                    if (i10 != 0) {
                                        i28 = i10;
                                    } else if (length2 <= 2) {
                                        i28 = (i25 - i24) + i29;
                                    } else {
                                        i28 = 0;
                                    }
                                    if (length2 == 0) {
                                        if (i3 == 2) {
                                            throw new defpackage.akfb("Empty -t- subtag in: ".concat(java.lang.String.valueOf(strSubstring2)));
                                        }
                                        i29 = -1;
                                        i25 = -1;
                                        break;
                                    }
                                    if (length2 == 1) {
                                        i29 = -1;
                                        break;
                                    }
                                    if (length2 != 2) {
                                        i29 = -1;
                                        if (i26 == -1) {
                                            i28 = 0;
                                        } else if (i27 == -1) {
                                            i27 = i25;
                                        }
                                    } else {
                                        i29 = -1;
                                        if (i26 == -1) {
                                            i28 = 0;
                                        } else if (i27 == -1) {
                                            i27 = i25;
                                        }
                                    }
                                    if (iIndexOf3 == i29) {
                                    }
                                }
                            }
                            if (i28 != i29) {
                                java.lang.String strSubstring6 = i28 == 0 ? strSubstring2.substring(i24) : strSubstring2.substring(i24, i28 + i24);
                                java.lang.String strD = d(strSubstring6);
                                defpackage.akff akffVarF = i2 == 1 ? f(strD, 2) : h(strD);
                                java.util.Map map = akffVarF.N;
                                if (map == null || map.isEmpty()) {
                                    this.L = akffVarF;
                                    i16 = i25;
                                } else {
                                    if (i3 == 2) {
                                        throw new defpackage.akfb(defpackage.hgb.n(strSubstring2, strSubstring6, "Illegal transform language: ", " in: "));
                                    }
                                    i16 = i29;
                                }
                            } else if (i25 == i24) {
                                if (i3 == 2) {
                                    throw new defpackage.akfb("No valid subtag found after -t- in: ".concat(java.lang.String.valueOf(strSubstring2)));
                                }
                                i16 = i29;
                            } else {
                                i16 = i25;
                            }
                            this.M = j$.util.DesugarCollections.unmodifiableMap(this.M);
                            i5 = i29;
                            i4 = 45;
                        } else {
                            if (i3 != 1) {
                                throw new defpackage.akfb("More than one -t- in: ".concat(java.lang.String.valueOf(strSubstring2)));
                            }
                            i4 = 45;
                            i5 = -1;
                            i16 = -1;
                        }
                    }
                }
            }
            strSubstring2 = strSubstring2.substring(0, i13);
        }
        if (strSubstring2.equals("root")) {
            this.I = strSubstring2;
            return;
        }
        defpackage.aigf aigfVar2 = y;
        if (aigfVar2.containsKey(strSubstring2)) {
            strSubstring2 = (java.lang.String) aigfVar2.get(strSubstring2);
        }
        if (s.contains(strSubstring2)) {
            m(strSubstring2, i2, i3);
            return;
        }
        java.util.Iterator it3 = E.h(strSubstring2).iterator();
        if (!it3.hasNext()) {
            throw new defpackage.akfb("Language tag must have 1+ non-empty subtags: ".concat(java.lang.String.valueOf(strSubstring2)));
        }
        java.lang.String strN = n(it3, strSubstring2, i3);
        defpackage.ahxn ahxnVar = t;
        if (!ahxnVar.h(strN) || strN.length() < 2) {
            i6 = 1;
            if (i3 == 1) {
                return;
            } else {
                i(strN, "Ill-formed language subtag", strSubstring2);
            }
        } else {
            i6 = 1;
        }
        if (!j(strN)) {
            if (i3 != i6) {
                throw new defpackage.akfc(defpackage.hgb.n(strSubstring2, strN, "Invalid language subtag: ", " in: "));
            }
            return;
        }
        this.I = strN;
        if (!it3.hasNext()) {
            m(this.I, i2, i3);
            return;
        }
        java.lang.String strN2 = n(it3, strSubstring2, i3);
        if (strN2.length() == 3 && ahxnVar.h(strN2)) {
            if (!j(strN2)) {
                if (i3 != 1) {
                    throw new defpackage.akfc(defpackage.hgb.n(strSubstring2, strN2, "Invalid extlang language subtag: ", " in: "));
                }
                m(this.I, i2, 1);
                return;
            }
            defpackage.aihd aihdVar = (defpackage.aihd) C.get(this.I);
            if (aihdVar == null || !aihdVar.contains(strN2)) {
                if (i3 != 1) {
                    throw new defpackage.akfc(defpackage.hgb.n(strSubstring2, strN2, "Invalid extlang language subtag: ", " in: "));
                }
                m(this.I, i2, 1);
                return;
            } else {
                this.I = strN2;
                if (!it3.hasNext()) {
                    m(this.I, i2, i3);
                    return;
                }
                strN2 = n(it3, strSubstring2, i3);
            }
        }
        m(this.I, i2, i3);
        if (strN2.length() == 4 && ahxnVar.h(strN2)) {
            int i30 = 1;
            try {
                java.lang.String strQ = defpackage.ahvr.q(strN2.substring(0, 1));
                try {
                    this.P = defpackage.ajsz.X(strQ + defpackage.ahvr.p(strN2.substring(1)));
                    if (!it3.hasNext()) {
                        return;
                    } else {
                        strN2 = n(it3, strSubstring2, i3);
                    }
                } catch (java.lang.IllegalArgumentException unused2) {
                    i30 = 1;
                    if (i3 != i30) {
                        throw new defpackage.akfc(defpackage.hgb.n(strSubstring2, strN2, "Illegal Script Code: ", " in: "));
                    }
                    return;
                }
            } catch (java.lang.IllegalArgumentException unused3) {
            }
        }
        if ((strN2.length() == 2 && ahxnVar.h(strN2)) || (strN2.length() == 3 && u.h(strN2))) {
            try {
                this.J = defpackage.akfg.a(strN2);
                if (!it3.hasNext()) {
                    return;
                } else {
                    strN2 = n(it3, strSubstring2, i3);
                }
            } catch (java.lang.IllegalArgumentException unused4) {
                if (i3 != 1) {
                    throw new defpackage.akfc(defpackage.hgb.n(strSubstring2, strN2, "Illegal Region Code: ", " in: "));
                }
                return;
            }
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        while (true) {
            if (strN2.length() <= 4 && (strN2.length() != 4 || (cCharAt = strN2.charAt(0)) < '0' || cCharAt > '9')) {
                break;
            }
            if (!A.contains(strN2)) {
                if (i3 != 1) {
                    throw new defpackage.akfc(defpackage.hgb.n(strSubstring2, strN2, "Invalid variant subtag: ", " in: "));
                }
                return;
            }
            if (!hashSet.contains(strN2)) {
                this.K.add(defpackage.ahvr.q(strN2));
                hashSet.add(strN2);
            }
            if (!it3.hasNext()) {
                return;
            } else {
                strN2 = n(it3, strSubstring2, i3);
            }
        }
        if (i3 != 1) {
            i(strN2, "Illegal subtag", strSubstring2);
        }
    }

    private final void m(java.lang.String str, int i2, int i3) {
        java.lang.String str2;
        if (i2 != 1 || (str2 = (java.lang.String) B.get(str)) == null || str2.equals(str)) {
            this.I = str;
        } else {
            l(d(str2), 1, i3);
        }
    }

    private static final java.lang.String n(java.util.Iterator it, java.lang.String str, int i2) {
        java.lang.String str2 = (java.lang.String) it.next();
        if (i2 == 2) {
            if (str2.length() <= 0 || str2.length() > 8) {
                i(str2, "Illegal length (must be 1..8)", str);
            }
            if (!w.h(str2)) {
                i(str2, defpackage.a.bp((byte) 41, str2, "Illegal characters in ("), str);
            }
        }
        return str2;
    }

    private static defpackage.aigf o() {
        defpackage.aigb aigbVar = new defpackage.aigb(4);
        for (java.lang.String str : "ar, aao, abh, abv, acm, acq, acw, acx, acy, adf, aeb, aec, afb, ajp, apc, apd, arb, arq, ars, ary, arz, auz, avl, ayh, ayl, ayn, ayp, bbz, pga, shu, ssh; kok, gom, knn; lv, ltg, lvs; ms, bjn, btj, bve, bvu, coa, dup, hji, jak, jax, kvb, kvr, kxd, lce, lcf, liw, max, meo, mfa, mfb, min, mqg, msi, mui, orn, ors, pel, pse, tmw, urk, vkk, vkt, xmm, zlm, zmi, zsm; sgn, ads, aed, aen, afg, ajs, ase, asf, asp, asq, asw, bfi, bfk, bog, bqn, bqy, bvl, bzs, cds, csc, csd, cse, csf, csg, csl, csn, csq, csr, csx, doq, dse, dsl, dsz, ecs, ehs, esl, esn, eso, eth, fcs, fse, fsl, fss, gds, gse, gsg, gsm, gss, gus, hab, haf, hds, hks, hos, hps, hsh, hsl, icl, iks, ils, inl, ins, ise, isg, isr, jcs, jhs, jks, jls, jos, jsl, jus, kgi, kvk, lbs, lgs, lls, lsb, lsc, lsg, lsl, lsn, lso, lsp, lst, lsv, lsw, lsy, lws, mdl, mfs, mre, msd, msr, mzc, mzg, mzy, nbs, ncs, nsi, nsl, nsp, nsr, nzs, okl, pgz, pks, prl, prz, psc, psd, psg, psl, pso, psp, psr, pys, rib, rms, rnb, rsi, rsl, rsm, rsn, sdl, sfb, sfs, sgg, sgx, slf, sls, sqk, sqs, sqx, ssp, ssr, svk, swl, syy, szs, tse, tsm, tsq, tss, tsy, tza, ugn, ugy, ukl, uks, vgt, vsi, vsl, vsv, wbs, xki, xml, xms, yds, ygs, yhs, ysl, ysm, zib, zsl; sw, swc, swh; uz, uzn, uzs; zh, cdo, cjy, cmn, cnp, cpx, csp, czh, czo, gan, hak, hnm, hsn, luh, lzh, mnp, nan, sjc, wuu, yue".split(";\\s*", -1)) {
            java.lang.String[] strArrSplit = str.split(",\\s*", 2);
            aigbVar.i(strArrSplit[0], defpackage.aihd.p(strArrSplit[1].split(",\\s*")));
        }
        return aigbVar.e(true);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Serialization proxy object required");
    }

    private java.lang.Object writeReplace() {
        return new akfe(this);
    }

    public final defpackage.akff c() {
        return h(d((java.lang.String) j$.util.Objects.requireNonNull(this.I)));
    }

    public final boolean e() {
        return this.q.equals("und");
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.akff) && ((defpackage.akff) obj).q.equals(this.q);
    }

    public final int hashCode() {
        return this.q.hashCode();
    }

    public final java.lang.String toString() {
        return this.q;
    }
}
