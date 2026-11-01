package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pkw extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;

    public pkw(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new defpackage.amzw(defpackage.pkw.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.List] */
    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        j$.util.Optional optional = (j$.util.Optional) list.get(0);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(1)).booleanValue();
        j$.util.Optional optional2 = (j$.util.Optional) list.get(2);
        j$.util.Optional optional3 = (j$.util.Optional) list.get(3);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.piw piwVar = new defpackage.piw(zBooleanValue, optional, arrayList, optional2, 0);
        if (true == optional3.isPresent()) {
            java.lang.Object obj2 = optional3.get();
            boolean z = piwVar.a;
            java.lang.Object obj3 = piwVar.b;
            ?? r4 = piwVar.c;
            java.lang.Object obj4 = piwVar.d;
            java.lang.String str = (java.lang.String) obj2;
            if (!z) {
                hvp hvpVar = new hvp((java.lang.Object) r4, str, 11);
                j$.util.Optional optional4 = (j$.util.Optional) obj3;
                if (true == optional4.isPresent()) {
                    java.lang.Object obj5 = optional4.get();
                    hvpVar.a.add(ft$.ExternalSyntheticApiModelOutline0.m(ft$.ExternalSyntheticApiModelOutline0.m(ft$.ExternalSyntheticApiModelOutline0.m(new android.app.Person.Builder(), (java.lang.CharSequence) hvpVar.b), (java.lang.String) obj5)));
                }
            }
            hvp hvpVar2 = new hvp((java.lang.Object) r4, str, 12);
            j$.util.Optional optional5 = (j$.util.Optional) obj4;
            if (true == optional5.isPresent()) {
                java.lang.Object obj6 = optional5.get();
                hvpVar2.a.add(ft$.ExternalSyntheticApiModelOutline0.m(ft$.ExternalSyntheticApiModelOutline0.m(ft$.ExternalSyntheticApiModelOutline0.m(new android.app.Person.Builder(), (java.lang.CharSequence) hvpVar2.b), android.net.Uri.fromParts("tel", (java.lang.String) obj6, null).toString())));
            }
            if (r4.isEmpty()) {
                r4.add(ft$.ExternalSyntheticApiModelOutline0.m(ft$.ExternalSyntheticApiModelOutline0.m(new android.app.Person.Builder(), str)));
            }
        }
        return aiql.z(aify.n(arrayList));
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        amzg amzgVar2 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar2.d(), amzgVar.d()});
    }
}
