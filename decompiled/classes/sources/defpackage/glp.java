package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class glp extends defpackage.gkz {
    private static final java.lang.String[] x = {"android:visibility:visibility", "android:visibility:parent"};
    public int w = 3;

    public static final void R(gli gliVar) {
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(gliVar.b.getVisibility());
        java.util.Map map = gliVar.a;
        map.put("android:visibility:visibility", numValueOf);
        map.put("android:visibility:parent", gliVar.b.getParent());
        int[] iArr = new int[2];
        gliVar.b.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    /* JADX WARN: Code duplicated, block: B:35:0x0084  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        if (r0.e == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        if (r9 == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0082, code lost:
    
        if (r0.c == 0) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final glo S(gli r8, gli r9) {
        /*
            glo r0 = new glo
            r0.<init>()
            r1 = 0
            r0.a = r1
            r0.b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.Map r6 = r8.a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.c = r7
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.e = r6
            goto L33
        L2f:
            r0.c = r4
            r0.e = r3
        L33:
            if (r9 == 0) goto L52
            java.util.Map r6 = r9.a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r3 = r6.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.d = r3
            java.lang.Object r2 = r6.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f = r2
            goto L56
        L52:
            r0.d = r4
            r0.f = r3
        L56:
            r2 = 1
            if (r8 == 0) goto L75
            if (r9 == 0) goto L7e
            int r8 = r0.c
            int r9 = r0.d
            if (r8 != r9) goto L70
            android.view.ViewGroup r8 = r0.e
            android.view.ViewGroup r9 = r0.f
            if (r8 == r9) goto L87
            android.view.ViewGroup r8 = r0.f
            if (r8 == 0) goto L84
            android.view.ViewGroup r8 = r0.e
            if (r8 != 0) goto L87
            goto L79
        L70:
            if (r8 == 0) goto L84
            if (r9 != 0) goto L87
            goto L79
        L75:
            int r8 = r0.d
            if (r8 != 0) goto L7e
        L79:
            r0.b = r2
        L7b:
            r0.a = r2
            goto L87
        L7e:
            if (r9 != 0) goto L87
            int r8 = r0.c
            if (r8 != 0) goto L87
        L84:
            r0.b = r1
            goto L7b
        L87:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.glp.S(gli, gli):glo");
    }

    @Override // defpackage.gkz
    public final boolean B(gli gliVar, gli gliVar2) {
        if (gliVar == null) {
            if (gliVar2 == null) {
                return false;
            }
        } else if (gliVar2 != null) {
            if (gliVar2.a.containsKey("android:visibility:visibility") != gliVar.a.containsKey("android:visibility:visibility")) {
                return false;
            }
        }
        glo gloVarS = S(gliVar, gliVar2);
        if (gloVarS.a) {
            return gloVarS.c == 0 || gloVarS.d == 0;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0080  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d6  */
    @Override // defpackage.gkz
    public final android.animation.Animator a(android.view.ViewGroup viewGroup, gli gliVar, gli gliVar2) {
        boolean z;
        int i;
        char c;
        int i2;
        int i3;
        android.view.ViewGroup viewGroup2;
        android.graphics.Bitmap bitmapM;
        gli gliVar3 = gliVar;
        glo gloVarS = S(gliVar, gliVar2);
        if (gloVarS.a && (gloVarS.e != null || gloVarS.f != null)) {
            int i4 = 1;
            if (!gloVarS.b) {
                int i5 = gloVarS.d;
                if ((this.w & 2) == 2 && gliVar3 != null) {
                    android.view.View view = gliVar3.b;
                    android.view.View view2 = gliVar2 != null ? gliVar2.b : null;
                    android.view.View view3 = (android.view.View) view.getTag(2131428859);
                    if (view3 != null) {
                        i = i5;
                        c = 1;
                        i2 = 0;
                        view2 = null;
                    } else {
                        if (view2 == null) {
                            z = true;
                            view2 = null;
                            view3 = null;
                        } else if (view2.getParent() == null) {
                            z = false;
                            view3 = view2;
                            view2 = null;
                        } else {
                            if (i5 == 4 || view == view2) {
                                z = false;
                            } else {
                                z = true;
                                view2 = null;
                            }
                            view3 = null;
                        }
                        if (!z) {
                            i = i5;
                            c = 1;
                            i2 = 0;
                            i4 = 0;
                        } else if (view.getParent() == null) {
                            i = i5;
                            view3 = view;
                            c = 1;
                            i4 = 0;
                            i2 = 0;
                        } else if (view.getParent() instanceof android.view.View) {
                            android.view.View view4 = (android.view.View) view.getParent();
                            if (S(l(view4, true), k(view4, true)).a) {
                                i = i5;
                                c = 1;
                                i2 = 0;
                                view2 = view2;
                                int id = view4.getId();
                                if (view4.getParent() == null && id != -1) {
                                    viewGroup.findViewById(id);
                                }
                            } else {
                                android.graphics.Matrix matrix = new android.graphics.Matrix();
                                matrix.setTranslate(-view4.getScrollX(), -view4.getScrollY());
                                int i6 = gll.b;
                                fn$.ExternalSyntheticApiModelOutline0.m(view, matrix);
                                fn$.ExternalSyntheticApiModelOutline0.m$1(viewGroup, matrix);
                                android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
                                matrix.mapRect(rectF);
                                int iRound = java.lang.Math.round(rectF.left);
                                int iRound2 = java.lang.Math.round(rectF.top);
                                int iRound3 = java.lang.Math.round(rectF.right);
                                c = 1;
                                int iRound4 = java.lang.Math.round(rectF.bottom);
                                i2 = 0;
                                android.widget.ImageView imageView = new android.widget.ImageView(view.getContext());
                                imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                                boolean zIsAttachedToWindow = view.isAttachedToWindow();
                                boolean zIsAttachedToWindow2 = viewGroup.isAttachedToWindow();
                                if (zIsAttachedToWindow) {
                                    i3 = 0;
                                    viewGroup2 = null;
                                } else {
                                    if (zIsAttachedToWindow2) {
                                        viewGroup2 = (android.view.ViewGroup) view.getParent();
                                        int iIndexOfChild = viewGroup2.indexOfChild(view);
                                        defpackage.dzs.f(viewGroup, view);
                                        i3 = iIndexOfChild;
                                    } else {
                                        i = i5;
                                        view2 = view2;
                                        bitmapM = null;
                                    }
                                    if (bitmapM != null) {
                                        imageView.setImageBitmap(bitmapM);
                                    }
                                    imageView.measure(android.view.View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
                                    imageView.layout(iRound, iRound2, iRound3, iRound4);
                                    view3 = imageView;
                                }
                                int iRound5 = java.lang.Math.round(rectF.width());
                                i = i5;
                                int iRound6 = java.lang.Math.round(rectF.height());
                                if (iRound5 <= 0 || iRound6 <= 0) {
                                    bitmapM = null;
                                } else {
                                    float fMin = java.lang.Math.min(1.0f, 1048576.0f / (iRound5 * iRound6));
                                    int iRound7 = java.lang.Math.round(iRound5 * fMin);
                                    int iRound8 = java.lang.Math.round(iRound6 * fMin);
                                    matrix.postTranslate(-rectF.left, -rectF.top);
                                    matrix.postScale(fMin, fMin);
                                    android.graphics.Picture picture = new android.graphics.Picture();
                                    android.graphics.Canvas canvasBeginRecording = picture.beginRecording(iRound7, iRound8);
                                    canvasBeginRecording.concat(matrix);
                                    view.draw(canvasBeginRecording);
                                    picture.endRecording();
                                    bitmapM = ft$.ExternalSyntheticApiModelOutline0.m(picture);
                                }
                                if (!zIsAttachedToWindow) {
                                    viewGroup.getOverlay().remove(view);
                                    viewGroup2.addView(view, i3);
                                }
                                if (bitmapM != null) {
                                    imageView.setImageBitmap(bitmapM);
                                }
                                imageView.measure(android.view.View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
                                imageView.layout(iRound, iRound2, iRound3, iRound4);
                                view3 = imageView;
                            }
                            i4 = i2;
                            view2 = view2;
                        } else {
                            i = i5;
                            c = 1;
                            i2 = 0;
                            i4 = 0;
                        }
                    }
                    if (view3 != null) {
                        if (i4 == 0) {
                            int[] iArr = (int[]) gliVar3.a.get("android:visibility:screenLocation");
                            int i7 = iArr[i2];
                            int i8 = iArr[c];
                            int[] iArr2 = new int[2];
                            viewGroup.getLocationOnScreen(iArr2);
                            view3.offsetLeftAndRight((i7 - iArr2[i2]) - view3.getLeft());
                            view3.offsetTopAndBottom((i8 - iArr2[c]) - view3.getTop());
                            defpackage.dzs.f(viewGroup, view3);
                        }
                        android.animation.Animator animatorF = f(viewGroup, view3, gliVar3, gliVar2);
                        if (i4 != 0) {
                            return animatorF;
                        }
                        if (animatorF == null) {
                            viewGroup.getOverlay().remove(view3);
                            return animatorF;
                        }
                        view.setTag(2131428859, view3);
                        gkw glnVar = new gln(this, viewGroup, view3, view);
                        animatorF.addListener(glnVar);
                        animatorF.addPauseListener(glnVar);
                        j().D(glnVar);
                        return animatorF;
                    }
                    if (view2 != null) {
                        int visibility = view2.getVisibility();
                        int i9 = gll.b;
                        fn$.ExternalSyntheticApiModelOutline0.m(view2, i2);
                        android.animation.Animator animatorF2 = f(viewGroup, view2, gliVar3, gliVar2);
                        if (animatorF2 == null) {
                            fn$.ExternalSyntheticApiModelOutline0.m(view2, visibility);
                            return animatorF2;
                        }
                        android.animation.Animator.AnimatorListener glmVar = new glm(view2, i);
                        animatorF2.addListener(glmVar);
                        j().D(glmVar);
                        return animatorF2;
                    }
                }
            } else if ((this.w & 1) == 1 && gliVar2 != null) {
                if (gliVar3 == null) {
                    android.view.View view5 = (android.view.View) gliVar2.b.getParent();
                    if (!S(k(view5, false), l(view5, false)).a) {
                        gliVar3 = null;
                    }
                }
                return g(viewGroup, gliVar2.b, gliVar3);
            }
        }
        return null;
    }

    @Override // defpackage.gkz
    public final void b(gli gliVar) {
        R(gliVar);
    }

    @Override // defpackage.gkz
    public void c(gli gliVar) {
        R(gliVar);
    }

    @Override // defpackage.gkz
    public final java.lang.String[] e() {
        return x;
    }

    public android.animation.Animator f(android.view.ViewGroup viewGroup, android.view.View view, gli gliVar, gli gliVar2) {
        throw null;
    }

    public android.animation.Animator g(android.view.ViewGroup viewGroup, android.view.View view, gli gliVar) {
        throw null;
    }
}
