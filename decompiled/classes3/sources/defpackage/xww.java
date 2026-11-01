package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xww implements defpackage.xuo {
    private final java.lang.Object b;
    private final int c;
    private final int d;
    private final java.lang.Class e;
    private final java.lang.Class f;
    private final defpackage.xuo g;
    private final java.util.Map h;
    private final defpackage.xus i;
    private int j;

    public xww(java.lang.Object obj, defpackage.xuo xuoVar, int i, int i2, java.util.Map map, java.lang.Class cls, java.lang.Class cls2, defpackage.xus xusVar) {
        anty.aI(obj, "Argument must not be null");
        this.b = obj;
        anty.aI(xuoVar, "Signature must not be null");
        this.g = xuoVar;
        this.c = i;
        this.d = i2;
        anty.aI(map, "Argument must not be null");
        this.h = map;
        anty.aI(cls, "Resource class must not be null");
        this.e = cls;
        anty.aI(cls2, "Transcode class must not be null");
        this.f = cls2;
        anty.aI(xusVar, "Argument must not be null");
        this.i = xusVar;
    }

    @Override // defpackage.xuo
    public final void a(java.security.MessageDigest messageDigest) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.xuo
    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.xww)) {
            return false;
        }
        defpackage.xww xwwVar = (defpackage.xww) obj;
        return this.b.equals(xwwVar.b) && this.g.equals(xwwVar.g) && this.d == xwwVar.d && this.c == xwwVar.c && this.h.equals(xwwVar.h) && this.e.equals(xwwVar.e) && this.f.equals(xwwVar.f) && this.i.equals(xwwVar.i);
    }

    @Override // defpackage.xuo
    public final int hashCode() {
        int i = this.j;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.b.hashCode();
        this.j = iHashCode;
        int iHashCode2 = (((((iHashCode * 31) + this.g.hashCode()) * 31) + this.c) * 31) + this.d;
        this.j = iHashCode2;
        int iHashCode3 = (iHashCode2 * 31) + this.h.hashCode();
        this.j = iHashCode3;
        int iHashCode4 = (iHashCode3 * 31) + this.e.hashCode();
        this.j = iHashCode4;
        int iHashCode5 = (iHashCode4 * 31) + this.f.hashCode();
        this.j = iHashCode5;
        int iHashCode6 = (iHashCode5 * 31) + this.i.hashCode();
        this.j = iHashCode6;
        return iHashCode6;
    }

    public final java.lang.String toString() {
        defpackage.xus xusVar = this.i;
        java.util.Map map = this.h;
        defpackage.xuo xuoVar = this.g;
        java.lang.Class cls = this.f;
        java.lang.Class cls2 = this.e;
        return "EngineKey{model=" + this.b.toString() + ", width=" + this.c + ", height=" + this.d + ", resourceClass=" + cls2.toString() + ", transcodeClass=" + cls.toString() + ", signature=" + xuoVar.toString() + ", hashCode=" + this.j + ", transformations=" + map.toString() + ", options=" + xusVar.toString() + '}';
    }
}
