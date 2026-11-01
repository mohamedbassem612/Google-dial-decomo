package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aeom implements defpackage.aeoo {
    private final apgw a;
    private final java.lang.Comparable b;

    public aeom(apgw apgwVar, java.lang.Comparable comparable) {
        this.a = apgwVar;
        this.b = comparable;
    }

    @Override // defpackage.aeoo
    public final long a() {
        return this.a.e((albw) null);
    }

    @Override // defpackage.aeoo
    public final /* synthetic */ java.lang.Object b() {
        return this.a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return this.b.compareTo(((defpackage.aeom) obj).b);
    }
}
