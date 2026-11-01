package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aptp {
    public final defpackage.aprr a;
    public final defpackage.aptn b;
    public final defpackage.apsy d;
    public defpackage.aptm h;
    public defpackage.aptf i;
    public defpackage.aptb j;
    public final int k;
    public int l;
    public int m;
    public final defpackage.aptl n;
    public defpackage.apti o;
    private final defpackage.apto p;
    private byte[] q;
    public final defpackage.aptw c = new defpackage.aptw(64);
    public int e = 0;
    public boolean f = false;
    public int g = 0;

    public aptp(java.io.InputStream inputStream, defpackage.apto aptoVar, int i, int i2, defpackage.aprr aprrVar, defpackage.aptn aptnVar, defpackage.aptl aptlVar) {
        this.p = aptoVar;
        this.l = i;
        this.k = i2;
        this.a = aprrVar;
        this.b = aptnVar;
        this.n = aptlVar;
        defpackage.apsy apsyVar = new defpackage.apsy(inputStream);
        this.d = apsyVar;
        this.j = new defpackage.aptb(apsyVar);
    }

    public static java.lang.String e(int i) {
        if (i == 0) {
            throw null;
        }
        switch (i - 1) {
            case 0:
                return "Start message";
            case 1:
                return "End message";
            case 2:
                return "Raw entity";
            case 3:
                return "Start header";
            case 4:
                return "Field";
            case 5:
                return "End header";
            case 6:
                return "Start multipart";
            case 7:
                return "End multipart";
            case 8:
                return "Preamble";
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                return "Epilogue";
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                return "Start bodypart";
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
            default:
                return "End bodypart";
            case 12:
                return "Body";
            case 13:
                return "End of stream";
        }
    }

    public final void a() {
        defpackage.aptb aptbVar = this.j;
        if (aptbVar.b) {
            return;
        }
        if (this.q == null) {
            this.q = new byte[2048];
        }
        while (aptbVar.read(this.q) != -1) {
        }
    }

    public final void b() {
        this.i = null;
        this.j = new defpackage.aptb(this.d);
    }

    public final void c() throws defpackage.aprn {
        java.lang.String str = this.o.b;
        if (str == null) {
            throw new defpackage.aprn("Multipart body does not have a valid boundary");
        }
        try {
            this.i = new defpackage.aptf(this.d, str, false);
            this.j = new defpackage.aptb(this.i);
        } catch (java.lang.IllegalArgumentException e) {
            throw new defpackage.aprn(e.getMessage(), e);
        }
    }

    public final void d(defpackage.aptk aptkVar) throws defpackage.aptq {
        defpackage.aprr aprrVar = this.a;
        if (aprrVar.a() && aprrVar.b()) {
            throw new defpackage.aptq(aptkVar);
        }
    }

    public final defpackage.aptp f(int i, int i2, java.io.InputStream inputStream) {
        defpackage.aptl aptlVar = this.n;
        defpackage.aptl aptlVar2 = new defpackage.aptl(aptlVar.e, aptlVar.b);
        defpackage.aptp aptpVar = new defpackage.aptp(inputStream, this.p, i, i2, this.a, this.b, aptlVar2);
        aptpVar.m = this.m;
        return aptpVar;
    }

    public final java.lang.String toString() {
        return getClass().getName() + " [" + e(this.l) + "][" + this.o.a + "][" + this.o.b + ']';
    }
}
