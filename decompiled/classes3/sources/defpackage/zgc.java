package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zgc extends aomh implements aonn {
    java.lang.Object a;
    int b;
    final /* synthetic */ aosb c;
    final /* synthetic */ java.lang.String d;
    final /* synthetic */ aonj e;
    final /* synthetic */ defpackage.abtr f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zgc(defpackage.abtr abtrVar, aosb aosbVar, java.lang.String str, aonj aonjVar, aoln aolnVar) {
        super(2, aolnVar);
        this.f = abtrVar;
        this.c = aosbVar;
        this.d = str;
        this.e = aonjVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0050  */
    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v1, types: [aoss, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.zfm zfmVar;
        defpackage.abtr abtrVar;
        java.lang.String str;
        java.lang.Object obj2;
        aolu aoluVar = aolu.a;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                aooc.af(obj);
            } else {
                if (i == 2) {
                    aooc.af(obj);
                    zfmVar = (defpackage.zfm) obj;
                    if (zfmVar != defpackage.zfm.a) {
                        abtrVar = this.f;
                        str = this.d;
                        this.a = zfmVar;
                        this.b = 3;
                        if (abtrVar.i(str, this) != aoluVar) {
                            return aoluVar;
                        }
                        obj2 = zfmVar;
                    }
                    return aojh.a;
                }
                obj2 = this.a;
                aooc.af(obj);
            }
            this.c.w(obj2);
            return aojh.a;
        }
        aooc.af(obj);
        defpackage.abtr abtrVar2 = this.f;
        aosb aosbVar = this.c;
        java.lang.String str2 = this.d;
        this.b = 1;
        java.lang.Object objA = ahvr.ag((aoss) abtrVar2.b, (ahda) abtrVar2.c, new defpackage.zjq(abtrVar2, str2, aosbVar, (aoln) null, 1)).a(this);
        if (objA != aoluVar) {
            objA = aojh.a;
        }
        if (objA == aoluVar) {
            return aoluVar;
        }
        aonj aonjVar = this.e;
        this.b = 2;
        obj = aonjVar.a(this);
        if (obj == aoluVar) {
            return aoluVar;
        }
        zfmVar = (defpackage.zfm) obj;
        if (zfmVar != defpackage.zfm.a) {
            abtrVar = this.f;
            str = this.d;
            this.a = zfmVar;
            this.b = 3;
            if (abtrVar.i(str, this) != aoluVar) {
                return aoluVar;
            }
            obj2 = zfmVar;
            this.c.w(obj2);
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.zgc(this.f, this.c, this.d, this.e, aolnVar);
    }
}
