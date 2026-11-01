package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nfv extends aomh implements aonj {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;
    final /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nfv(aeeu aeeuVar, aeco aecoVar, java.lang.String str, java.util.List list, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.e = aeeuVar;
        this.c = aecoVar;
        this.d = str;
        this.b = list;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.List] */
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            aoln aolnVar = (aoln) obj;
            java.lang.Object obj2 = this.b;
            java.lang.Object obj3 = this.c;
            return new defpackage.nfv((defpackage.nmo) obj2, (android.content.Context) obj3, (pgi) this.d, (defpackage.mqt) this.e, aolnVar, 0).b(aojh.a);
        }
        if (i == 1) {
            aoln aolnVar2 = (aoln) obj;
            java.lang.Object obj4 = this.b;
            java.lang.Object obj5 = this.c;
            return new defpackage.nfv((defpackage.iin) obj4, (ifv) obj5, (ifz) this.e, (defpackage.igg) this.d, aolnVar2, 1).b(aojh.a);
        }
        if (i != 2) {
            aoln aolnVar3 = (aoln) obj;
            java.lang.Object obj6 = this.e;
            java.lang.Object obj7 = this.c;
            return new defpackage.nfv((aeeu) obj6, (aeco) obj7, (java.lang.String) this.d, (java.util.List) this.b, aolnVar3, 3).b(aojh.a);
        }
        aoln aolnVar4 = (aoln) obj;
        java.lang.Object obj8 = this.b;
        java.lang.Object obj9 = this.c;
        return new defpackage.nfv((defpackage.nmo) obj8, (android.content.Context) obj9, (pgi) this.d, (defpackage.mqt) this.e, aolnVar4, 2, null).b(aojh.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r11 != r0) goto L13;
     */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfv.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nfv(defpackage.iin iinVar, ifv ifvVar, ifz ifzVar, defpackage.igg iggVar, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.b = iinVar;
        this.c = ifvVar;
        this.e = ifzVar;
        this.d = iggVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nfv(defpackage.nmo nmoVar, android.content.Context context, pgi pgiVar, defpackage.mqt mqtVar, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.b = nmoVar;
        this.c = context;
        this.d = pgiVar;
        this.e = mqtVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nfv(defpackage.nmo nmoVar, android.content.Context context, pgi pgiVar, defpackage.mqt mqtVar, aoln aolnVar, int i, byte[] bArr) {
        super(1, aolnVar);
        this.$cid = i;
        this.b = nmoVar;
        this.c = context;
        this.d = pgiVar;
        this.e = mqtVar;
    }
}
