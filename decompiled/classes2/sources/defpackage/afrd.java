package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class afrd extends eac {
    private final android.view.View a;
    private int b;
    private int c;
    private final int[] e;

    public afrd(android.view.View view) {
        super(0);
        this.e = new int[2];
        this.a = view;
    }

    public final eax b(eax eaxVar, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            aiyy aiyyVar = (aiyy) it.next();
            if ((aiyyVar.g() & 8) != 0) {
                this.a.setTranslationY(afpc.b(this.c, 0, baa$.ExternalSyntheticApiModelOutline1.m(((eae) aiyyVar.a).a)));
                break;
            }
        }
        return eaxVar;
    }

    public final eab c(aiyy aiyyVar, eab eabVar) {
        android.view.View view = this.a;
        int[] iArr = this.e;
        view.getLocationOnScreen(iArr);
        int i = this.b - iArr[1];
        this.c = i;
        view.setTranslationY(i);
        return eabVar;
    }

    public final void d(aiyy aiyyVar) {
        this.a.setTranslationY(0.0f);
    }

    public final void e(aiyy aiyyVar) {
        android.view.View view = this.a;
        int[] iArr = this.e;
        view.getLocationOnScreen(iArr);
        this.b = iArr[1];
    }
}
