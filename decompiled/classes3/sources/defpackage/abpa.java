package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abpa extends kh {
    final /* synthetic */ com.google.android.libraries.communications.ux.views.buttonbar.ButtonBarGrid a;

    public abpa(com.google.android.libraries.communications.ux.views.buttonbar.ButtonBarGrid buttonBarGrid) {
        this.a = buttonBarGrid;
    }

    public final int a() {
        return w().size();
    }

    public final /* bridge */ /* synthetic */ ld d(android.view.ViewGroup viewGroup, int i) {
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131624045, viewGroup, false);
        dzs.i(viewInflate, new defpackage.aboz());
        aooh.c(viewInflate);
        return new defpackage.abpd(this.a, viewInflate);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:46:0x011e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0124  */
    /* JADX WARN: Code duplicated, block: B:50:0x012a  */
    /* JADX WARN: Code duplicated, block: B:52:0x012e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0132  */
    public final /* synthetic */ void m(ld ldVar, int i) {
        java.lang.Object objS;
        java.lang.Object drawable;
        java.lang.Long l;
        android.graphics.drawable.Animatable animatable;
        java.lang.Long l2;
        java.lang.Object objS2;
        defpackage.abpj abpjVar;
        defpackage.abpd abpdVar = (defpackage.abpd) ldVar;
        aooh.f(abpdVar, "viewHolder");
        defpackage.abpg abpgVar = (defpackage.abpg) w().get(abpdVar.b());
        aooh.f(abpgVar, "data");
        defpackage.aljf aljfVar = abpdVar.t;
        java.lang.Object obj = aljfVar.d;
        android.view.View view = (android.view.View) obj;
        defpackage.abpg abpgVar2 = (defpackage.abpg) view.getTag(2131427630);
        view.setTag(2131427630, abpgVar);
        pez pezVar = abpdVar.s.c;
        aooh.f(abpgVar, "data");
        defpackage.abpe abpeVar = abpgVar.d;
        java.lang.Object obj2 = aljfVar.c;
        aooh.f(obj2, "<this>");
        android.widget.ImageView imageView = (android.widget.ImageView) obj2;
        int i2 = imageView.getLayoutParams().width;
        if (i2 != imageView.getLayoutParams().height) {
            android.view.View view2 = (android.view.View) obj2;
            android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = i2;
            view2.setLayoutParams(layoutParams);
        }
        if (abpeVar.b) {
            java.lang.Object objS3 = abts.s(abpeVar);
            if (abpgVar2 != null) {
                objS2 = abts.s(abpgVar2.d);
            } else {
                abpgVar2 = null;
                objS2 = null;
            }
            if (!aooh.n(objS3, objS2)) {
                android.content.Context context = view.getContext();
                aooh.c(context);
                android.graphics.drawable.Drawable drawable2 = context.getDrawable(abpeVar.a);
                aooh.c(drawable2);
                int i3 = defpackage.abpj.b;
                aooh.f(context, "context");
                aooh.f(drawable2, "drawable");
                if (drawable2 instanceof defpackage.abpj) {
                    abpjVar = (defpackage.abpj) drawable2;
                } else if (drawable2 instanceof android.graphics.drawable.LayerDrawable) {
                    android.graphics.drawable.LayerDrawable layerDrawable = (android.graphics.drawable.LayerDrawable) drawable2;
                    if (layerDrawable.findIndexByLayerId(2131428948) != -1) {
                        abpjVar = new defpackage.abpj(layerDrawable);
                    } else {
                        android.graphics.drawable.Drawable drawable3 = context.getDrawable(2131232142);
                        aooh.c(drawable3);
                        aooh.d(drawable3, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
                        defpackage.abpj abpjVar2 = new defpackage.abpj((android.graphics.drawable.LayerDrawable) drawable3);
                        aooh.f(drawable2, "value");
                        abpjVar2.a.setDrawableByLayerId(2131428947, drawable2);
                        abpjVar = abpjVar2;
                    }
                } else {
                    android.graphics.drawable.Drawable drawable4 = context.getDrawable(2131232142);
                    aooh.c(drawable4);
                    aooh.d(drawable4, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
                    defpackage.abpj abpjVar3 = new defpackage.abpj((android.graphics.drawable.LayerDrawable) drawable4);
                    aooh.f(drawable2, "value");
                    abpjVar3.a.setDrawableByLayerId(2131428947, drawable2);
                    abpjVar = abpjVar3;
                }
                imageView.setImageDrawable(abpjVar);
            }
        } else {
            java.lang.Object objS4 = abts.s(abpeVar);
            if (abpgVar2 != null) {
                objS = abts.s(abpgVar2.d);
            } else {
                abpgVar2 = null;
                objS = null;
            }
            if (!aooh.n(objS4, objS)) {
                imageView.setImageResource(abpeVar.a);
            }
        }
        defpackage.abpe abpeVar2 = abpgVar2 != null ? abpgVar2.d : null;
        if ((abpeVar2 instanceof defpackage.abpe) && abpeVar2.a == abpeVar.a && (l2 = abpeVar.c) != null) {
            java.lang.Long l3 = abpeVar2.c;
            long jLongValue = l2.longValue();
            if (l3 == null || l3.longValue() != jLongValue) {
                drawable = imageView.getDrawable();
                if (drawable != null) {
                    l = abpeVar.c;
                    if (drawable instanceof android.graphics.drawable.Animatable) {
                        animatable = (android.graphics.drawable.Animatable) drawable;
                        if (l != null) {
                            animatable.start();
                        } else {
                            animatable.stop();
                        }
                    }
                }
            }
        } else {
            drawable = imageView.getDrawable();
            if (drawable != null) {
                l = abpeVar.c;
                if (drawable instanceof android.graphics.drawable.Animatable) {
                    animatable = (android.graphics.drawable.Animatable) drawable;
                    if (l != null) {
                        animatable.start();
                    } else {
                        animatable.stop();
                    }
                }
            }
        }
        imageView.setImageTintList((android.content.res.ColorStateList) aljfVar.a);
        view.setContentDescription(abpgVar.f.a(aljfVar.l()));
        defpackage.abpf abpfVar = abpgVar.e;
        java.lang.Object obj3 = aljfVar.b;
        ((android.view.View) obj3).setVisibility(0);
        ((android.widget.TextView) obj3).setText(abpfVar.a(aljfVar.l()));
        defpackage.abph abphVar = new defpackage.abph(abpgVar, 0);
        abphVar.a(obj);
        abphVar.a(obj2);
        view.setOnClickListener(new knj(pezVar, abpgVar, aljfVar, 7, (char[]) null));
    }

    public final java.util.List w() {
        return this.a.b;
    }
}
