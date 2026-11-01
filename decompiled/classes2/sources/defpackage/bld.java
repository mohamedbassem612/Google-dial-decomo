package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bld {
    public static final defpackage.bks a = defpackage.bkr.b;

    public static final boolean a(cvf cvfVar) {
        android.view.MotionEvent motionEventA;
        java.util.List list = cvfVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!a.x(((defpackage.cvm) list.get(i)).i, 2)) {
                android.view.MotionEvent motionEventA2 = cvfVar.a();
                if ((motionEventA2 != null && motionEventA2.isFromSource(8194)) || ((motionEventA = cvfVar.a()) != null && motionEventA.isFromSource(1048584))) {
                    break;
                    break;
                }
                return false;
            }
        }
        return true;
    }
}
