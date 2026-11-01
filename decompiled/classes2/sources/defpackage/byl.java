package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class byl {
    public static final alm a;
    public static final alm b;
    public static final alm c;
    private static final ajh d;

    static {
        ajb ajbVar = new ajb(0.4f, 0.0f, 0.6f, 1.0f);
        d = ajbVar;
        a = new alm(120, ajk.a, 2);
        b = new alm(150, ajbVar, 2);
        c = new alm(120, ajbVar, 2);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object a(aii aiiVar, float f, avj avjVar, avj avjVar2, aoln aolnVar) {
        defpackage.byk bykVar;
        if (aolnVar instanceof defpackage.byk) {
            bykVar = (defpackage.byk) aolnVar;
            int i = bykVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                bykVar.b = i - Integer.MIN_VALUE;
            } else {
                bykVar = new defpackage.byk(aolnVar);
            }
        } else {
            bykVar = new defpackage.byk(aolnVar);
        }
        defpackage.byk bykVar2 = bykVar;
        java.lang.Object obj = bykVar2.a;
        aolu aoluVar = aolu.a;
        int i2 = bykVar2.b;
        if (i2 == 0) {
            aooc.af(obj);
            alm almVar = null;
            if (avjVar2 != null) {
                if ((avjVar2 instanceof avl) || (avjVar2 instanceof avb) || (avjVar2 instanceof avh) || (avjVar2 instanceof avd)) {
                    almVar = a;
                }
            } else if (avjVar != null) {
                if ((avjVar instanceof avl) || (avjVar instanceof avb)) {
                    almVar = b;
                } else if (avjVar instanceof avh) {
                    almVar = c;
                } else if (avjVar instanceof avd) {
                    almVar = b;
                }
            }
            if (almVar != null) {
                dpi dpiVar = new dpi(f);
                bykVar2.b = 1;
                if (aii.l(aiiVar, dpiVar, almVar, (java.lang.Object) null, (aonj) null, bykVar2, 12) == aoluVar) {
                    return aoluVar;
                }
            } else {
                dpi dpiVar2 = new dpi(f);
                bykVar2.b = 2;
                if (aiiVar.f(dpiVar2, bykVar2) == aoluVar) {
                    return aoluVar;
                }
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }
}
