package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class xoh extends aomh implements aonn {
    java.lang.Object a;
    int b;
    final /* synthetic */ defpackage.xon c;
    final /* synthetic */ defpackage.xmb d;
    final /* synthetic */ android.os.PersistableBundle e;
    final /* synthetic */ aomy f;
    final /* synthetic */ defpackage.xni g;
    final /* synthetic */ aomy h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xoh(defpackage.xon xonVar, defpackage.xmb xmbVar, android.os.PersistableBundle persistableBundle, aomy aomyVar, defpackage.xni xniVar, aomy aomyVar2, aoln aolnVar) {
        super(2, aolnVar);
        this.c = xonVar;
        this.d = xmbVar;
        this.e = persistableBundle;
        this.f = aomyVar;
        this.g = xniVar;
        this.h = aomyVar2;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        aolu aoluVar = aolu.a;
        int i = this.b;
        try {
            try {
                if (i != 0) {
                    if (i != 1) {
                        obj2 = this.a;
                        aooc.af(obj);
                    } else {
                        aooc.af(obj);
                    }
                    defpackage.xon.h((defpackage.xmq) obj2, null);
                    this.h.a();
                    return aojh.a;
                }
                aooc.af(obj);
                defpackage.xmb xmbVar = this.d;
                java.lang.Object objB = this.e;
                defpackage.xix xixVar = defpackage.xjb.c;
                java.lang.String nodeName = xmbVar.getNodeName();
                java.lang.String nodeComponent = xmbVar.getNodeComponent();
                long j = xmbVar.b;
                try {
                    objB = xmbVar.a().a().b(objB);
                } catch (java.lang.Exception unused) {
                }
                xixVar.a(new defpackage.xit(nodeName, nodeComponent, j, objB));
                this.f.a();
                defpackage.xox.a("OnboardingTaskServiceServer", a.bx(defpackage.xfh.a(this.g), "Starting task execution for node "));
                defpackage.xmb xmbVar2 = this.d;
                android.os.PersistableBundle persistableBundle = this.e;
                this.b = 1;
                obj = defpackage.xmb.m(xmbVar2, persistableBundle, this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                defpackage.xmq xmqVar = (defpackage.xmq) obj;
                defpackage.xni xniVar = this.g;
                defpackage.xox.b("OnboardingTaskServiceServer", a.bo(xmqVar, defpackage.xfh.a(xniVar), "Successfully executed task for node ", ": state="));
                defpackage.xmw xmwVar = this.c.d;
                xmwVar.m(xniVar, xmqVar);
                this.a = xmqVar;
                this.b = 2;
                if (xmwVar.e(this) == aoluVar) {
                    return aoluVar;
                }
                obj2 = xmqVar;
                defpackage.xon.h((defpackage.xmq) obj2, null);
                this.h.a();
                return aojh.a;
            } catch (java.lang.Exception e) {
                defpackage.xni xniVar2 = this.g;
                defpackage.xox.f("OnboardingTaskServiceServer", a.bk(defpackage.xfh.a(xniVar2), "Task execution for node ", " failed."), e);
                defpackage.xon.h(this.c.d.c(xniVar2), e);
                if (e instanceof java.util.concurrent.CancellationException) {
                    throw e;
                }
            }
        } catch (java.lang.Throwable th) {
            this.h.a();
            throw th;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.xoh(this.c, this.d, this.e, this.f, this.g, this.h, aolnVar);
    }
}
