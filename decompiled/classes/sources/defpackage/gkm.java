package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gkm extends defpackage.gkz {
    private static final java.lang.String[] w = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final android.util.Property x = new defpackage.gke(android.graphics.PointF.class);
    private static final android.util.Property y = new defpackage.gkf(android.graphics.PointF.class);
    private static final android.util.Property z = new defpackage.gkg(android.graphics.PointF.class);
    private static final android.util.Property A = new defpackage.gkh(android.graphics.PointF.class);
    private static final android.util.Property B = new defpackage.gki(android.graphics.PointF.class);

    private static final void f(gli gliVar) {
        android.view.View view = gliVar.b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        java.util.Map map = gliVar.a;
        map.put("android:changeBounds:bounds", new android.graphics.Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", gliVar.b.getParent());
    }

    /* JADX WARN: Code duplicated, block: B:13:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:14:0x0061  */
    /* JADX WARN: Code duplicated, block: B:15:0x0066 A[PHI: r13
      0x0066: PHI (r13v3 int) = (r13v1 int), (r13v0 int) binds: [B:13:0x005f, B:10:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x0068 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:18:0x006d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0071 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:21:0x0073  */
    /* JADX WARN: Code duplicated, block: B:22:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x0108  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.gkz
    public final android.animation.Animator a(android.view.ViewGroup viewGroup, gli gliVar, gli gliVar2) {
        int i;
        android.animation.ObjectAnimator objectAnimatorOfObject;
        android.animation.Animator animator;
        if (gliVar != null && gliVar2 != null) {
            java.util.Map map = gliVar.a;
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) map.get("android:changeBounds:parent");
            java.util.Map map2 = gliVar2.a;
            android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) map2.get("android:changeBounds:parent");
            if (viewGroup2 != null && viewGroup3 != null) {
                android.view.View view = gliVar2.b;
                android.graphics.Rect rect = (android.graphics.Rect) map.get("android:changeBounds:bounds");
                android.graphics.Rect rect2 = (android.graphics.Rect) map2.get("android:changeBounds:bounds");
                int i2 = rect.left;
                int i3 = rect2.left;
                int i4 = rect.top;
                int i5 = rect2.top;
                int i6 = rect.right;
                int i7 = rect2.right;
                int i8 = rect.bottom;
                int i9 = rect2.bottom;
                int i10 = i6 - i2;
                int i11 = i8 - i4;
                int i12 = i7 - i3;
                int i13 = i9 - i5;
                android.graphics.Rect rect3 = (android.graphics.Rect) map.get("android:changeBounds:clip");
                android.graphics.Rect rect4 = (android.graphics.Rect) map2.get("android:changeBounds:clip");
                if (i10 == 0) {
                    if (i12 != 0) {
                        i = 0;
                    } else if (i13 == 0) {
                        i13 = 0;
                        i = 0;
                    } else {
                        if (i2 == i3 || i4 != i5) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        if (i6 == i7 || i8 != i9) {
                            i++;
                        }
                    }
                } else if (i11 == 0) {
                    i11 = 0;
                    if (i12 != 0) {
                        i = 0;
                    } else if (i13 == 0) {
                        i13 = 0;
                        i = 0;
                    } else {
                        if (i2 == i3) {
                            i = 1;
                        } else {
                            i = 1;
                        }
                        if (i6 == i7) {
                            i++;
                        } else {
                            i++;
                        }
                    }
                } else {
                    if (i2 == i3) {
                        i = 1;
                    } else {
                        i = 1;
                    }
                    if (i6 == i7) {
                        i++;
                    } else {
                        i++;
                    }
                }
                if (rect3 == null ? rect4 != null : !rect3.equals(rect4)) {
                    i++;
                }
                int i14 = i;
                if (i14 > 0) {
                    int i15 = gll.b;
                    fn$.ExternalSyntheticApiModelOutline0.m(view, i2, i4, i6, i8);
                    if (i14 == 2) {
                        float f = i5;
                        float f2 = i3;
                        float f3 = i4;
                        float f4 = i2;
                        if (i10 == i12 && i11 == i13) {
                            objectAnimatorOfObject = android.animation.ObjectAnimator.ofObject(view, (android.util.Property<android.view.View, V>) B, (android.animation.TypeConverter) null, defpackage.dzk.F(f4, f3, f2, f));
                        } else {
                            float f5 = i7;
                            gkl gklVar = new gkl(view);
                            android.animation.ObjectAnimator objectAnimatorOfObject2 = android.animation.ObjectAnimator.ofObject(gklVar, (android.util.Property<gkl, V>) x, (android.animation.TypeConverter) null, defpackage.dzk.F(f4, f3, f2, f));
                            android.animation.ObjectAnimator objectAnimatorOfObject3 = android.animation.ObjectAnimator.ofObject(gklVar, (android.util.Property<gkl, V>) y, (android.animation.TypeConverter) null, defpackage.dzk.F(i6, i8, f5, i9));
                            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                            animatorSet.playTogether(objectAnimatorOfObject2, objectAnimatorOfObject3);
                            animatorSet.addListener(new gkj(gklVar));
                            animator = animatorSet;
                        }
                        if (view.getParent() instanceof android.view.ViewGroup) {
                            return animator;
                        }
                        android.view.ViewGroup viewGroup4 = (android.view.ViewGroup) view.getParent();
                        fn$.ExternalSyntheticApiModelOutline0.m(viewGroup4, true);
                        j().D(new gkk(viewGroup4));
                        return animator;
                    }
                    if (i2 == i3 && i4 == i5) {
                        objectAnimatorOfObject = android.animation.ObjectAnimator.ofObject(view, (android.util.Property<android.view.View, V>) z, (android.animation.TypeConverter) null, defpackage.dzk.F(i6, i8, i7, i9));
                    } else {
                        objectAnimatorOfObject = android.animation.ObjectAnimator.ofObject(view, (android.util.Property<android.view.View, V>) A, (android.animation.TypeConverter) null, defpackage.dzk.F(i2, i4, i3, i5));
                    }
                    animator = objectAnimatorOfObject;
                    if (view.getParent() instanceof android.view.ViewGroup) {
                        return animator;
                    }
                    android.view.ViewGroup viewGroup5 = (android.view.ViewGroup) view.getParent();
                    fn$.ExternalSyntheticApiModelOutline0.m(viewGroup5, true);
                    j().D(new gkk(viewGroup5));
                    return animator;
                }
            }
        }
        return null;
    }

    @Override // defpackage.gkz
    public final void b(gli gliVar) {
        f(gliVar);
    }

    @Override // defpackage.gkz
    public final void c(gli gliVar) {
        f(gliVar);
    }

    @Override // defpackage.gkz
    public final boolean d() {
        return true;
    }

    @Override // defpackage.gkz
    public final java.lang.String[] e() {
        return w;
    }
}
