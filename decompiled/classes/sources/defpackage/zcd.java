package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zcd implements defpackage.zbo {
    public final zce a;
    public final java.util.List b;
    public final java.lang.Long c;
    public final zcf d;
    public final defpackage.wsc e;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ zcd(zce zceVar, java.util.List list, defpackage.wsc wscVar, java.lang.Long l, zcf zcfVar, int i) {
        zcfVar = (i & 16) != 0 ? zcf.a : zcfVar;
        int i2 = i & 8;
        int i3 = i & 4;
        int i4 = i & 2;
        l = i2 != 0 ? null : l;
        this(zceVar, i4 != 0 ? null : list, i3 != 0 ? null : wscVar, l, zcfVar);
    }

    public static /* synthetic */ defpackage.zcd a(defpackage.zcd zcdVar, defpackage.wsc wscVar, java.lang.Long l, zcf zcfVar) {
        return new defpackage.zcd(zcdVar.a, zcdVar.b, wscVar, l, zcfVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.zcd) {
            defpackage.zcd zcdVar = (defpackage.zcd) obj;
            if (this.a == zcdVar.a && defpackage.aooh.n(this.b, zcdVar.b) && defpackage.aooh.n(this.e, zcdVar.e) && defpackage.aooh.n(this.c, zcdVar.c) && this.d == zcdVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.util.List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        defpackage.wsc wscVar = this.e;
        int iHashCode3 = (iHashCode2 + (wscVar == null ? 0 : wscVar.hashCode())) * 31;
        java.lang.Long l = this.c;
        return ((iHashCode3 + (l != null ? l.hashCode() : 0)) * 31) + this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "MethodInvocationDebugEvent(type=" + this.a + ", parameters=" + this.b + ", returnValue=" + this.e + ", timestamp=" + this.c + ", marker=" + this.d + ')';
    }

    public zcd(zce zceVar, java.util.List list, defpackage.wsc wscVar, java.lang.Long l, zcf zcfVar) {
        defpackage.aooh.f(zcfVar, "marker");
        this.a = zceVar;
        this.b = list;
        this.e = wscVar;
        this.c = l;
        this.d = zcfVar;
    }
}
