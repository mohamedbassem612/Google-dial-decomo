package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aae {
    public boolean a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public aae(adb adbVar, defpackage.wj wjVar) {
        this.b = adbVar;
        this.c = wjVar;
    }

    public final android.view.MotionEvent a() {
        return (android.view.MotionEvent) ((defpackage.wj) this.c).c;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final boolean b(long j) {
        java.lang.Object obj;
        ?? r0 = ((defpackage.wj) this.c).b;
        int size = r0.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = r0.get(i);
            if (((defpackage.cvo) obj).a == j) {
                break;
            }
            i++;
        }
        defpackage.cvo cvoVar = (defpackage.cvo) obj;
        return (cvoVar != null && cvoVar.h) || c() == 5;
    }

    public final int c() {
        int i = ((defpackage.wj) this.c).a;
        if (i != 1) {
            return i;
        }
        android.view.MotionEvent motionEventA = a();
        if (motionEventA != null) {
            int iM = da$.ExternalSyntheticApiModelOutline0.m(motionEventA);
            if (iM == 1) {
                return 2;
            }
            if (iM == 2) {
                return 3;
            }
            if (iM != 3) {
                if (iM == 5 && android.os.Build.VERSION.SDK_INT >= 34) {
                    return 4;
                }
            } else if (android.os.Build.VERSION.SDK_INT >= 34) {
                return 5;
            }
        }
        return 1;
    }

    public final float d() {
        return ((wfz) this.b).c;
    }

    public final void e(float f) {
        ((wfy) this.b).b(f);
    }

    public aae(java.lang.Object obj, java.lang.Object obj2) {
        this.b = obj;
        this.c = obj2;
    }
}
