package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class adkj extends defpackage.adld {
    private final com.google.android.libraries.micore.superpacks.common.Slice a;
    private final defpackage.adip b;
    private final defpackage.adim c;
    private final defpackage.aigf d;
    private final com.google.android.libraries.micore.superpacks.base.BasePriority e;
    private final defpackage.admd f;
    private volatile transient defpackage.adin g;
    private volatile transient java.lang.String h;

    public adkj(com.google.android.libraries.micore.superpacks.common.Slice slice, defpackage.adip adipVar, defpackage.adim adimVar, defpackage.admd admdVar, defpackage.aigf aigfVar, com.google.android.libraries.micore.superpacks.base.BasePriority basePriority) {
        if (slice == null) {
            throw new java.lang.NullPointerException("Null slice");
        }
        this.a = slice;
        this.b = adipVar;
        this.c = adimVar;
        this.f = admdVar;
        this.d = aigfVar;
        this.e = basePriority;
    }

    @Override // defpackage.adld
    public final com.google.android.libraries.micore.superpacks.base.BasePriority a() {
        return this.e;
    }

    @Override // defpackage.adld
    public final defpackage.adim b() {
        return this.c;
    }

    @Override // defpackage.adld
    public final defpackage.adip c() {
        return this.b;
    }

    @Override // defpackage.adld
    public final com.google.android.libraries.micore.superpacks.common.Slice d() {
        return this.a;
    }

    @Override // defpackage.adld
    public final defpackage.aigf e() {
        return this.d;
    }

    public final boolean equals(java.lang.Object obj) {
        defpackage.admd admdVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.adld) {
            defpackage.adld adldVar = (defpackage.adld) obj;
            if (this.a.equals(adldVar.d()) && this.b.equals(adldVar.c()) && this.c.equals(adldVar.b()) && ((admdVar = this.f) != null ? admdVar.equals(adldVar.f()) : adldVar.f() == null) && defpackage.ahvr.aJ(this.d, adldVar.e()) && this.e.equals(adldVar.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.adld
    public final defpackage.admd f() {
        return this.f;
    }

    @Override // defpackage.adld
    public final defpackage.adin g() {
        if (this.g == null) {
            synchronized (this) {
                if (this.g == null) {
                    com.google.android.libraries.micore.superpacks.base.BasePriority basePriority = this.e;
                    com.google.android.libraries.micore.superpacks.common.Slice slice = this.a;
                    int iC = slice.c();
                    int iB = slice.b();
                    int iD = slice.d();
                    int iA = slice.a();
                    int iE = slice.e();
                    defpackage.adin adinVar = defpackage.adin.f;
                    this.g = new defpackage.adil(basePriority, iC, iB, iD, iA, iE);
                    if (this.g == null) {
                        throw new java.lang.NullPointerException("fetchParams() cannot return null");
                    }
                }
            }
        }
        return this.g;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        defpackage.admd admdVar = this.f;
        return (((((iHashCode * 1000003) ^ (admdVar == null ? 0 : admdVar.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    @Override // defpackage.adld
    public final java.lang.String toString() {
        if (this.h == null) {
            synchronized (this) {
                if (this.h == null) {
                    defpackage.ahym ahymVar = new defpackage.ahym("");
                    ahymVar.c();
                    ahymVar.b("fetcher", defpackage.agab.cl(this.b));
                    ahymVar.b("unpacker", defpackage.agab.cl(this.f));
                    defpackage.aigf aigfVar = this.d;
                    if (!aigfVar.isEmpty()) {
                        defpackage.ailj it = aigfVar.entrySet().iterator();
                        while (it.hasNext()) {
                            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                            ahymVar.b("validator", ((java.lang.String) entry.getKey()) + ": " + defpackage.agab.cl((defpackage.adkm) entry.getValue()));
                        }
                    }
                    ahymVar.f("size", this.a.f().d());
                    defpackage.adim adimVar = this.c;
                    ahymVar.f("compressed", adimVar.a);
                    ahymVar.b("scheme", adimVar.b);
                    ahymVar.b("params", g());
                    this.h = ahymVar.toString();
                    if (this.h == null) {
                        throw new java.lang.NullPointerException("toString() cannot return null");
                    }
                }
            }
        }
        return this.h;
    }
}
