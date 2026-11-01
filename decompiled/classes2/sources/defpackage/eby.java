package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class eby extends android.view.View {
    final /* synthetic */ android.view.ViewGroup a;
    final /* synthetic */ defpackage.ecb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eby(defpackage.ecb ecbVar, android.content.Context context, android.view.ViewGroup viewGroup) {
        super(context);
        this.b = ecbVar;
        this.a = viewGroup;
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(android.content.res.Configuration configuration) {
        android.graphics.drawable.Drawable background = this.a.getBackground();
        int color = background instanceof android.graphics.drawable.ColorDrawable ? ((android.graphics.drawable.ColorDrawable) background).getColor() : 0;
        defpackage.ecb ecbVar = this.b;
        if (ecbVar.e == color) {
            return;
        }
        ecbVar.e = color;
        java.util.ArrayList arrayList = ecbVar.b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((defpackage.ebv) arrayList.get(size)).c(color);
            }
        }
    }
}
