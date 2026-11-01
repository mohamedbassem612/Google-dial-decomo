package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dns {
    public static final /* synthetic */ int g = 0;
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final defpackage.dnx f;
    private final dnt h;

    static {
        new defpackage.dns(null);
    }

    public /* synthetic */ dns(byte[] bArr) {
        defpackage.dnx dnxVar = defpackage.dnx.a;
        this.a = false;
        this.b = 0;
        this.c = true;
        this.d = 1;
        this.e = 1;
        this.h = null;
        this.f = dnxVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dns) {
            defpackage.dns dnsVar = (defpackage.dns) obj;
            boolean z = dnsVar.a;
            int i = dnsVar.b;
            boolean z2 = dnsVar.c;
            int i2 = dnsVar.d;
            int i3 = dnsVar.e;
            dnt dntVar = dnsVar.h;
            if (defpackage.aooh.n(this.f, dnsVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() - 532689276;
    }

    public final java.lang.String toString() {
        return "ImeOptions(singleLine=false, capitalization=None, autoCorrect=true, keyboardType=Text, imeAction=Default, platformImeOptions=null, hintLocales=" + this.f + ')';
    }

    public dns() {
        this(null);
    }
}
