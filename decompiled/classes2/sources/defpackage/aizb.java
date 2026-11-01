package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aizb {
    public static final ahxn a;
    public static final defpackage.aizb b;
    private static final defpackage.aiga c;
    private static final java.util.Map d;
    private static final apjb j;
    private final java.lang.String e;
    private final java.lang.String f;
    private final defpackage.aiga g;
    private java.lang.String h;
    private int i;

    static {
        java.lang.String strP = ahvr.p(java.nio.charset.StandardCharsets.UTF_8.name());
        defpackage.aifz aifzVar = new defpackage.aifz();
        aifzVar.b("charset", strP);
        c = aifzVar.a();
        a = new defpackage.ahww(new defpackage.ahww(new defpackage.ahww(ahwz.a, new defpackage.ahxj(defpackage.ahxg.a)), new defpackage.ahxf(' ')), ahxn.n("()<>@,;:\\\"/[]?="));
        new ahxl(new defpackage.ahww(ahwz.a, new defpackage.ahxj(defpackage.ahxg.a)), new ahxd('\t'));
        ahxn.n("\"\\");
        ahxn.m(" \t\r\n");
        d = new java.util.HashMap();
        d("*", "*");
        d("text", "*");
        d("image", "*");
        d("audio", "*");
        d("video", "*");
        d("application", "*");
        d("font", "*");
        a("text", "cache-manifest");
        a("text", "css");
        a("text", "csv");
        a("text", "html");
        a("text", "calendar");
        a("text", "markdown");
        a("text", "plain");
        a("text", "javascript");
        a("text", "tab-separated-values");
        a("text", "vcard");
        a("text", "vnd.wap.wml");
        a("text", "xml");
        a("text", "vtt");
        d("image", "bmp");
        d("image", "x-canon-crw");
        d("image", "gif");
        d("image", "vnd.microsoft.icon");
        d("image", "jpeg");
        d("image", "png");
        d("image", "vnd.adobe.photoshop");
        a("image", "svg+xml");
        d("image", "tiff");
        d("image", "avif");
        d("image", "webp");
        d("image", "heif");
        d("image", "jp2");
        d("audio", "mp4");
        d("audio", "mpeg");
        d("audio", "ogg");
        d("audio", "webm");
        d("audio", "l16");
        d("audio", "l24");
        d("audio", "basic");
        d("audio", "aac");
        d("audio", "vorbis");
        d("audio", "x-ms-wma");
        d("audio", "x-ms-wax");
        d("audio", "vnd.rn-realaudio");
        d("audio", "vnd.wave");
        d("video", "mp4");
        d("video", "mpeg");
        d("video", "ogg");
        d("video", "quicktime");
        d("video", "webm");
        d("video", "x-ms-wmv");
        d("video", "x-flv");
        d("video", "3gpp");
        d("video", "3gpp2");
        a("application", "xml");
        a("application", "atom+xml");
        d("application", "x-bzip2");
        a("application", "dart");
        d("application", "vnd.apple.pkpass");
        d("application", "vnd.ms-fontobject");
        d("application", "epub+zip");
        d("application", "x-www-form-urlencoded");
        d("application", "pkcs12");
        d("application", "binary");
        d("application", "cbor");
        d("application", "geo+json");
        d("application", "gzip");
        d("application", "x-gzip");
        d("application", "hal+json");
        a("application", "javascript");
        d("application", "jose");
        d("application", "jose+json");
        b = a("application", "json");
        d("application", "jwt");
        a("application", "manifest+json");
        d("application", "vnd.google-earth.kml+xml");
        d("application", "vnd.google-earth.kmz");
        d("application", "mbox");
        d("application", "x-apple-aspen-config");
        d("application", "vnd.ms-excel");
        d("application", "vnd.ms-outlook");
        d("application", "vnd.ms-powerpoint");
        d("application", "msword");
        d("application", "dash+xml");
        d("application", "wasm");
        d("application", "x-nacl");
        d("application", "x-pem-file");
        d("application", "x-pnacl");
        d("application", "octet-stream");
        d("application", "ogg");
        d("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");
        d("application", "vnd.openxmlformats-officedocument.presentationml.presentation");
        d("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        d("application", "vnd.oasis.opendocument.graphics");
        d("application", "vnd.oasis.opendocument.presentation");
        d("application", "vnd.oasis.opendocument.spreadsheet");
        d("application", "vnd.oasis.opendocument.text");
        a("application", "opensearchdescription+xml");
        d("application", "pdf");
        d("application", "postscript");
        d("application", "protobuf");
        a("application", "rdf+xml");
        a("application", "rtf");
        d("application", "font-sfnt");
        d("application", "x-shockwave-flash");
        d("application", "vnd.sketchup.skp");
        a("application", "soap+xml");
        d("application", "x-tar");
        d("application", "font-woff");
        d("application", "font-woff2");
        a("application", "xhtml+xml");
        a("application", "xrd+xml");
        d("application", "zip");
        d("font", "collection");
        d("font", "otf");
        d("font", "sfnt");
        d("font", "ttf");
        d("font", "woff");
        d("font", "woff2");
        d("application", "yaml");
        j = new apjb(new ahyj("; "));
    }

    private aizb(java.lang.String str, java.lang.String str2, defpackage.aiga aigaVar) {
        this.e = str;
        this.f = str2;
        this.g = aigaVar;
    }

    private static defpackage.aizb a(java.lang.String str, java.lang.String str2) {
        defpackage.aizb aizbVar = new defpackage.aizb(str, str2, c);
        c(aizbVar);
        ahyn.h(java.nio.charset.StandardCharsets.UTF_8);
        return aizbVar;
    }

    private final java.util.Map b() {
        return ahvr.aI(this.g.map, new agqd(18));
    }

    private static void c(defpackage.aizb aizbVar) {
        d.put(aizbVar, aizbVar);
    }

    private static void d(java.lang.String str, java.lang.String str2) {
        c(new defpackage.aizb(str, str2, defpackage.aien.a));
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aizb) {
            defpackage.aizb aizbVar = (defpackage.aizb) obj;
            if (this.e.equals(aizbVar.e) && this.f.equals(aizbVar.f) && b().equals(aizbVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.i;
        if (i != 0) {
            return i;
        }
        int iHash = j$.util.Objects.hash(new java.lang.Object[]{this.e, this.f, b()});
        this.i = iHash;
        return iHash;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.h;
        if (str != null) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.e);
        sb.append('/');
        sb.append(this.f);
        defpackage.aiga aigaVar = this.g;
        if (!aigaVar.w()) {
            sb.append("; ");
            j.y(sb, new aijl(new defpackage.aijm(aigaVar, new defpackage.aijj(new agqd(17), 0))));
        }
        java.lang.String string = sb.toString();
        this.h = string;
        return string;
    }
}
