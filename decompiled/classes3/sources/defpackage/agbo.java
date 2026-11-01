package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class agbo implements android.os.Handler.Callback {
    /* JADX WARN: Code duplicated, block: B:13:0x006f  */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        int i = message.what;
        int height = 0;
        if (i == 0) {
            defpackage.agbv agbvVar = (defpackage.agbv) message.obj;
            defpackage.agbu agbuVar = agbvVar.j;
            if (agbuVar.getParent() == null) {
                dup layoutParams = agbuVar.getLayoutParams();
                if (layoutParams instanceof dup) {
                    dup dupVar = layoutParams;
                    com.google.android.material.snackbar.BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = agbvVar.t;
                    if (baseTransientBottomBar$Behavior == null) {
                        baseTransientBottomBar$Behavior = new com.google.android.material.snackbar.BaseTransientBottomBar$Behavior();
                    }
                    baseTransientBottomBar$Behavior.g.a = agbvVar.v;
                    baseTransientBottomBar$Behavior.f = new defpackage.aprf(agbvVar);
                    dupVar.b(baseTransientBottomBar$Behavior);
                    if (agbvVar.d() == null) {
                        dupVar.g = 80;
                    }
                }
                android.view.ViewGroup viewGroup = agbvVar.h;
                agbuVar.g = true;
                viewGroup.addView(agbuVar);
                agbuVar.g = false;
                if (agbvVar.d() != null) {
                    int[] iArr = new int[2];
                    agbvVar.d().getLocationOnScreen(iArr);
                    int i2 = iArr[1];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr2);
                    height = (iArr2[1] + viewGroup.getHeight()) - i2;
                }
                agbvVar.p = height;
                agbvVar.j();
                agbuVar.setVisibility(4);
            }
            if (agbuVar.isLaidOut()) {
                agbvVar.i();
            } else {
                agbvVar.s = true;
            }
        } else {
            if (i != 1) {
                return false;
            }
            defpackage.agbv agbvVar2 = (defpackage.agbv) message.obj;
            int i3 = message.arg1;
            if (agbvVar2.l()) {
                defpackage.agbu agbuVar2 = agbvVar2.j;
                if (agbuVar2.getVisibility() != 0) {
                    agbvVar2.f(i3);
                } else if (agbuVar2.c == 1) {
                    android.animation.ValueAnimator valueAnimatorC = agbvVar2.c(1.0f, 0.0f);
                    valueAnimatorC.setDuration(agbvVar2.d);
                    valueAnimatorC.addListener(new defpackage.agbl(agbvVar2, i3));
                    valueAnimatorC.start();
                } else {
                    android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
                    valueAnimator.setIntValues(0, agbvVar2.b());
                    valueAnimator.setInterpolator(agbvVar2.f);
                    valueAnimator.setDuration(agbvVar2.e);
                    valueAnimator.addListener(new defpackage.agbn(agbvVar2, i3));
                    valueAnimator.addUpdateListener(new defpackage.afvi(agbvVar2, 5, (short[]) null));
                    valueAnimator.start();
                }
            } else {
                agbvVar2.f(i3);
            }
        }
        return true;
    }
}
