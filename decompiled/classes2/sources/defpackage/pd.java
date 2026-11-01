package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class pd {
    public final java.util.Map a;
    public final java.util.Map b;
    public final java.util.Map c;

    public pd(java.util.Map map, java.util.Map map2, java.util.Map map3) {
        dzk.x(map);
        this.a = map;
        dzk.x(map2);
        this.b = map2;
        dzk.x(map3);
        this.c = map3;
    }

    public final java.util.Map a() {
        return j$.util.DesugarCollections.unmodifiableMap(this.b);
    }

    public final java.util.Map b() {
        return j$.util.DesugarCollections.unmodifiableMap(this.a);
    }

    public final java.lang.String toString() {
        return "{\n  successes: " + this.a + "\n  failures: " + this.b + "\n}";
    }
}
