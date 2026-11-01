package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ecb {
    public final android.view.View a;
    public final java.util.ArrayList b = new java.util.ArrayList();
    public dwn c;
    public dwn d;
    public int e;

    public ecb(android.view.ViewGroup viewGroup) {
        android.view.View childAt;
        dwn dwnVar = dwn.a;
        this.c = dwnVar;
        this.d = dwnVar;
        android.graphics.drawable.Drawable background = viewGroup.getBackground();
        int i = 0;
        this.e = background instanceof android.graphics.drawable.ColorDrawable ? ((android.graphics.drawable.ColorDrawable) background).getColor() : 0;
        defpackage.eby ebyVar = new defpackage.eby(this, viewGroup.getContext(), viewGroup);
        this.a = ebyVar;
        ebyVar.setVisibility(8);
        ebyVar.setWillNotDraw(true);
        defpackage.ebx ebxVar = new defpackage.ebx(this, i);
        int i2 = dzs.a;
        dzk.o(ebyVar, ebxVar);
        eae.a(ebyVar, new defpackage.ebz(this));
        int childCount = viewGroup.getChildCount();
        do {
            childCount--;
            if (childCount < 0) {
                childAt = null;
                break;
            }
            childAt = viewGroup.getChildAt(childCount);
        } while (childAt.isAttachedToWindow() == viewGroup.isAttachedToWindow());
        if (childAt == null) {
            viewGroup.addView(ebyVar, 0);
        } else {
            childAt.addOnAttachStateChangeListener(new defpackage.eca(viewGroup, ebyVar, 0));
        }
    }

    public static final dwn a(eax eaxVar) {
        return dwn.c(eaxVar.f(519), eaxVar.f(64));
    }
}
