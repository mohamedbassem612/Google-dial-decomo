package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fnv implements defpackage.eqx {
    private static final defpackage.eqg f;
    private static final defpackage.eqg g;
    public final java.lang.String a;
    public final java.lang.String b;
    public final long c;
    public final long d;
    public final byte[] e;
    private int h;

    static {
        defpackage.eqf eqfVar = new defpackage.eqf();
        eqfVar.c("application/id3");
        f = new defpackage.eqg(eqfVar);
        defpackage.eqf eqfVar2 = new defpackage.eqf();
        eqfVar2.c("application/x-scte35");
        g = new defpackage.eqg(eqfVar2);
    }

    public fnv(java.lang.String str, java.lang.String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return defpackage.fnv.f;
     */
    @Override // defpackage.eqx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eqg a() {
        /*
            r2 = this;
            java.lang.String r2 = r2.a
            int r0 = r2.hashCode()
            r1 = -1468477611(0xffffffffa878cf55, float:-1.38117235E-14)
            if (r0 == r1) goto L29
            r1 = -795945609(0xffffffffd08ed577, float:-1.9170834E10)
            if (r0 == r1) goto L1e
            r1 = 1303648457(0x4db418c9, float:3.776904E8)
            if (r0 != r1) goto L34
            java.lang.String r0 = "https://developer.apple.com/streaming/emsg-id3"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L34
            goto L26
        L1e:
            java.lang.String r0 = "https://aomedia.org/emsg/ID3"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L34
        L26:
            eqg r2 = defpackage.fnv.f
            goto L35
        L29:
            java.lang.String r0 = "urn:scte:scte35:2014:bin"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L34
            eqg r2 = defpackage.fnv.g
            goto L35
        L34:
            r2 = 0
        L35:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fnv.a():eqg");
    }

    @Override // defpackage.eqx
    public final byte[] c() {
        if (a() != null) {
            return this.e;
        }
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.fnv fnvVar = (defpackage.fnv) obj;
            if (this.c == fnvVar.c && this.d == fnvVar.d && j$.util.Objects.equals(this.a, fnvVar.a) && j$.util.Objects.equals(this.b, fnvVar.b) && java.util.Arrays.equals(this.e, fnvVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.h;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + anty.M(this.c)) * 31) + anty.M(this.d)) * 31) + java.util.Arrays.hashCode(this.e);
        this.h = iHashCode;
        return iHashCode;
    }

    public final java.lang.String toString() {
        return "EMSG: scheme=" + this.a + ", id=" + this.d + ", durationMs=" + this.c + ", value=" + this.b;
    }

    @Override // defpackage.eqx
    public final /* synthetic */ void b(defpackage.eqv eqvVar) {
    }
}
