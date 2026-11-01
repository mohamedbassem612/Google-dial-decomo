package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class alac implements java.lang.Comparable {
    public final int a;
    public final defpackage.alcr b;

    public alac(int i, defpackage.alcr alcrVar) {
        this.a = i;
        this.b = alcrVar;
    }

    public static final void b(java.lang.Object obj, java.lang.Object obj2) {
        ((defpackage.akzx) obj).z((defpackage.alad) obj2);
    }

    public final defpackage.alcs a() {
        return this.b.s;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return this.a - ((defpackage.alac) obj).a;
    }
}
