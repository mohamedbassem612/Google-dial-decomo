package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aaan extends aaah {
    public final java.util.concurrent.atomic.AtomicBoolean a;
    public final java.util.concurrent.atomic.AtomicReference b;
    public final java.lang.String c;
    public final aaag d;
    public final android.os.Handler e;
    final /* synthetic */ aaap f;
    private final java.util.List g;

    public aaan(aaap aaapVar, java.util.List list, java.lang.String str, aaag aaagVar) {
        j$.util.Objects.requireNonNull(aaapVar);
        this.f = aaapVar;
        this.a = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.b = new java.util.concurrent.atomic.AtomicReference();
        this.g = list;
        this.c = str;
        this.d = aaagVar;
        this.e = aaapVar.a(aaagVar);
    }

    public final void c(com.google.android.gms.common.api.Status status) {
        java.util.List list = this.g;
        if (aaap.b(list)) {
            apkl.h(((aagf) this.d).b, aehj.cc(((defpackage.aaam) list.get(0)).a.a), 1035);
        } else {
            aaag aaagVar = this.d;
            java.lang.String str = this.c;
            android.content.Context context = ((aagf) aaagVar).b;
            apkl.h(context, str, 1028);
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                apkl.h(context, aehj.cc(((defpackage.aaam) it.next()).a.a), 1029);
            }
        }
        aify aifyVar = (aify) j$.util.Collection.-EL.stream(list).map(new defpackage.yoz(17)).collect(aido.a);
        int size = aifyVar.size();
        for (int i = 0; i < size; i++) {
            aa$.ExternalSyntheticApiModelOutline1.m(aa$.ExternalSyntheticApiModelOutline1.m(aifyVar.get(i)), status);
        }
        this.f.c(this.a, this.e, this.b, this.c, this.d);
    }
}
