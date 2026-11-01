package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class zfs extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    int e;
    final /* synthetic */ defpackage.zfu f;
    final /* synthetic */ albh g;
    final /* synthetic */ j$.time.Duration h;
    final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zfs(int i, defpackage.zfu zfuVar, albh albhVar, j$.time.Duration duration, aoln aolnVar) {
        super(2, aolnVar);
        this.i = i;
        this.f = zfuVar;
        this.g = albhVar;
        this.h = duration;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.zfs zfsVar;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Object obj6;
        java.lang.Object obj7;
        java.lang.Object obj8;
        java.lang.Object obj9;
        aolu aoluVar = aolu.a;
        int i = this.e;
        if (i != 0) {
            if (i == 1) {
                obj5 = this.d;
                obj3 = this.c;
                obj4 = this.b;
                obj2 = this.a;
                aooc.af(obj);
                zfsVar = this;
                zfsVar.a = null;
                zfsVar.b = null;
                zfsVar.c = null;
                zfsVar.d = null;
                zfsVar.e = 2;
                obj = ((defpackage.zgx) obj2).d((defpackage.zfd) obj4, (defpackage.zff) obj3, (defpackage.zdv) obj5, (byte[]) obj, zfsVar);
                if (obj == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i != 2) {
                    if (i != 3) {
                        aooc.af(obj);
                    } else {
                        obj9 = this.d;
                        obj8 = this.c;
                        obj7 = this.b;
                        obj6 = this.a;
                        aooc.af(obj);
                        j$.time.Duration duration = this.h;
                        this.a = null;
                        this.b = null;
                        this.c = null;
                        this.d = null;
                        this.e = 4;
                        obj = ((defpackage.zgx) obj6).c((defpackage.zfd) obj7, (defpackage.zff) obj8, (defpackage.zdv) obj9, (byte[]) obj, duration, this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                    }
                    return (defpackage.zfn) obj;
                }
                aooc.af(obj);
            }
            return (defpackage.zfn) obj;
        }
        aooc.af(obj);
        int i2 = this.i - 1;
        defpackage.zfu zfuVar = this.f;
        if (i2 != 0) {
            albh albhVar = this.g;
            obj6 = zfuVar.f;
            this.a = obj6;
            obj7 = zfuVar.c;
            this.b = obj7;
            defpackage.zff zffVar = zfuVar.d;
            this.c = zffVar;
            defpackage.zdt zdtVar = zfuVar.b;
            defpackage.zdv zdvVar = zdtVar.c;
            this.d = zdvVar;
            this.e = 3;
            obj = zdtVar.b(albhVar, this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            obj8 = zffVar;
            obj9 = zdvVar;
            j$.time.Duration duration2 = this.h;
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = 4;
            obj = ((defpackage.zgx) obj6).c((defpackage.zfd) obj7, (defpackage.zff) obj8, (defpackage.zdv) obj9, (byte[]) obj, duration2, this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            return (defpackage.zfn) obj;
        }
        zfsVar = this;
        albh albhVar2 = zfsVar.g;
        obj2 = zfuVar.f;
        zfsVar.a = obj2;
        defpackage.zfd zfdVar = zfuVar.c;
        zfsVar.b = zfdVar;
        obj3 = zfuVar.d;
        zfsVar.c = obj3;
        defpackage.zdt zdtVar2 = zfuVar.b;
        defpackage.zdv zdvVar2 = zdtVar2.c;
        zfsVar.d = zdvVar2;
        zfsVar.e = 1;
        java.lang.Object objB = zdtVar2.b(albhVar2, zfsVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        obj4 = zfdVar;
        obj5 = zdvVar2;
        obj = objB;
        zfsVar.a = null;
        zfsVar.b = null;
        zfsVar.c = null;
        zfsVar.d = null;
        zfsVar.e = 2;
        obj = ((defpackage.zgx) obj2).d((defpackage.zfd) obj4, (defpackage.zff) obj3, (defpackage.zdv) obj5, (byte[]) obj, zfsVar);
        if (obj == aoluVar) {
            return aoluVar;
        }
        return (defpackage.zfn) obj;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.zfs(this.i, this.f, this.g, this.h, aolnVar);
    }
}
