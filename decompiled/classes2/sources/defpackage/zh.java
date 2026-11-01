package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class zh {
    final java.util.Set a;
    final java.util.Set b;
    final java.util.Set c;
    public int d;
    int e;
    public int f;
    boolean g;
    boolean h;
    public boolean i;
    boolean j;
    defpackage.zl k;

    public zh(defpackage.zi ziVar) {
        java.util.HashSet hashSet = new java.util.HashSet();
        this.a = hashSet;
        java.util.HashSet hashSet2 = new java.util.HashSet();
        this.b = hashSet2;
        java.util.HashSet hashSet3 = new java.util.HashSet();
        this.c = hashSet3;
        this.d = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
        this.e = 0;
        this.j = false;
        this.k = defpackage.zl.b;
        j$.util.Objects.requireNonNull(ziVar);
        this.d = ziVar.c;
        this.e = ziVar.d;
        this.f = ziVar.e;
        this.k = ziVar.j;
        hashSet.addAll(ziVar.k);
        hashSet2.addAll(ziVar.l);
        hashSet3.addAll(ziVar.m);
        this.g = ziVar.f;
        this.h = ziVar.g;
        this.i = ziVar.h;
        this.j = ziVar.i;
    }

    public final void a(int i) {
        this.c.add(java.lang.Integer.valueOf(i));
    }

    public final void b() {
        this.e = 1;
    }

    public final void c() {
        this.g = true;
    }

    public final void d() {
        this.j = true;
    }

    public zh() {
        this.a = new java.util.HashSet();
        this.b = new java.util.HashSet();
        this.c = new java.util.HashSet();
        this.d = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
        this.e = 0;
        this.j = false;
        this.k = defpackage.zl.b;
    }
}
