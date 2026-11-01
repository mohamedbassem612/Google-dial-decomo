package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aeaf extends aomh implements aonj {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ aeag d;
    final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeaf(aeag aeagVar, boolean z, aoln aolnVar) {
        super(1, aolnVar);
        this.d = aeagVar;
        this.e = z;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.aeaf(this.d, this.e, (aoln) obj).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object aootVar;
        java.lang.Object obj2;
        java.lang.Object obj3;
        aolu aoluVar = aolu.a;
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                obj3 = this.a;
                aooc.af(obj);
            } else {
                java.lang.Object obj4 = this.b;
                java.lang.Object obj5 = this.a;
                aooc.af(obj);
                obj2 = obj4;
                aootVar = obj5;
            }
            return ((aoot) obj3).a;
        }
        aooc.af(obj);
        aootVar = new aoot();
        aeag aeagVar = this.d;
        this.a = aootVar;
        this.b = aootVar;
        this.c = 1;
        obj = aeagVar.f(this);
        if (obj == aoluVar) {
            return aoluVar;
        }
        obj2 = aootVar;
        java.lang.String str = ((aegw) obj).k;
        aooh.e(str, "getFetchOnlyId(...)");
        ((aoot) obj2).a = str;
        aoot aootVar2 = (aoot) aootVar;
        if (((java.lang.CharSequence) aootVar2.a).length() == 0 && this.e) {
            java.lang.String string = java.util.UUID.randomUUID().toString();
            aooh.e(string, "toString(...)");
            aootVar2.a = string;
            ecx ecxVar = (ecx) this.d.b.a();
            ghv ghvVar = new ghv(aootVar2, (aoln) null, 9);
            this.a = aootVar;
            this.b = null;
            this.c = 2;
            if (ecxVar.a(ghvVar, this) == aoluVar) {
                return aoluVar;
            }
        }
        obj3 = aootVar;
        return ((aoot) obj3).a;
    }
}
