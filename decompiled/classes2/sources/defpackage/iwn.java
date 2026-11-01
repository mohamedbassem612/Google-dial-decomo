package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class iwn extends aomh implements aonj {
    int a;
    final /* synthetic */ zpo b;
    final /* synthetic */ boolean c;
    final /* synthetic */ defpackage.iwy d;
    final /* synthetic */ java.lang.String e;
    final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwn(zpo zpoVar, boolean z, defpackage.iwy iwyVar, java.lang.String str, boolean z2, aoln aolnVar) {
        super(1, aolnVar);
        this.b = zpoVar;
        this.c = z;
        this.d = iwyVar;
        this.e = str;
        this.f = z2;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.iwn(this.b, this.c, this.d, this.e, this.f, (aoln) obj).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    public final java.lang.Object b(java.lang.Object obj) {
        qid qidVar;
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i != 0) {
            if (((java.lang.Boolean) obj).booleanValue()) {
                if (this.f) {
                    qidVar = qid.s;
                } else {
                    qidVar = qid.r;
                }
                return new qip(qid.f, qidVar, qim.f);
            }
        } else if (this.b == zpo.d && this.c) {
            defpackage.iwy iwyVar = this.d;
            java.lang.String str = this.e;
            this.a = 1;
            obj = iwyVar.a(str, true, this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            if (((java.lang.Boolean) obj).booleanValue()) {
                if (this.f) {
                    qidVar = qid.s;
                } else {
                    qidVar = qid.r;
                }
                return new qip(qid.f, qidVar, qim.f);
            }
        }
        return null;
    }
}
