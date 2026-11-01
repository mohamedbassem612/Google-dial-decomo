package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gib {
    public final java.lang.String a;
    public final java.util.Map b;
    public final java.util.Set c;
    public final java.util.Set d;

    public gib(java.lang.String str, java.util.Map map, java.util.Set set, java.util.Set set2) {
        aooh.f(map, "columns");
        aooh.f(set, "foreignKeys");
        this.a = str;
        this.b = map;
        this.c = set;
        this.d = set2;
    }

    public final boolean equals(java.lang.Object obj) {
        return defpackage.hgu.S(this, obj);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return defpackage.hgu.Q(this);
    }
}
