package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class piw implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ piw(jxe jxeVar, boolean z, aift aiftVar, java.lang.Boolean bool, int i) {
        this.$cid = i;
        this.b = jxeVar;
        this.a = z;
        this.d = aiftVar;
        this.c = bool;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        int i = this.$cid;
        boolean z = this.a;
        if (i != 0) {
            java.lang.Long l = (java.lang.Long) obj;
            java.lang.Object obj2 = this.d;
            java.lang.Object obj3 = this.b;
            if (z) {
                ((aift) obj2).i(((jxe) obj3).n.i(l.longValue(), jxn.q));
            }
            if (((java.lang.Boolean) this.c).booleanValue()) {
                return;
            }
            jxe jxeVar = (jxe) obj3;
            jxeVar.l.o(rmx.sq);
            ((aift) obj2).i(jxeVar.n.i(l.longValue(), jxn.p));
            return;
        }
        ?? r0 = this.c;
        java.lang.String str = (java.lang.String) obj;
        if (!z) {
            java.lang.Object obj4 = this.b;
            hvp hvpVar = new hvp((java.lang.Object) r0, str, 11);
            j$.util.Optional optional = (j$.util.Optional) obj4;
            if (true == optional.isPresent()) {
                java.lang.Object obj5 = optional.get();
                hvpVar.a.add(ft$.ExternalSyntheticApiModelOutline0.m(ft$.ExternalSyntheticApiModelOutline0.m(ft$.ExternalSyntheticApiModelOutline0.m(new android.app.Person.Builder(), (java.lang.CharSequence) hvpVar.b), (java.lang.String) obj5)));
            }
        }
        java.lang.Object obj6 = this.d;
        hvp hvpVar2 = new hvp((java.lang.Object) r0, str, 12);
        j$.util.Optional optional2 = (j$.util.Optional) obj6;
        if (true == optional2.isPresent()) {
            java.lang.Object obj7 = optional2.get();
            hvpVar2.a.add(ft$.ExternalSyntheticApiModelOutline0.m(ft$.ExternalSyntheticApiModelOutline0.m(ft$.ExternalSyntheticApiModelOutline0.m(new android.app.Person.Builder(), (java.lang.CharSequence) hvpVar2.b), android.net.Uri.fromParts("tel", (java.lang.String) obj7, null).toString())));
        }
        if (r0.isEmpty()) {
            r0.add(ft$.ExternalSyntheticApiModelOutline0.m(ft$.ExternalSyntheticApiModelOutline0.m(new android.app.Person.Builder(), str)));
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return this.$cid != 0 ? j$.util.function.Consumer.-CC.$default$andThen(this, consumer) : j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ piw(boolean z, j$.util.Optional optional, java.util.List list, j$.util.Optional optional2, int i) {
        this.$cid = i;
        this.a = z;
        this.b = optional;
        this.c = list;
        this.d = optional2;
    }
}
