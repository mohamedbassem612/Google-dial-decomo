package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afpg {
    private final aec a = new aec(0);
    private final aec b = new aec(0);

    public static defpackage.afpg b(android.content.Context context, android.content.res.TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return c(context, resourceId);
    }

    public static defpackage.afpg c(android.content.Context context, int i) {
        defpackage.afpg afpgVarH = null;
        try {
            android.animation.Animator animatorLoadAnimator = android.animation.AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof android.animation.AnimatorSet) {
                afpgVarH = h(((android.animation.AnimatorSet) animatorLoadAnimator).getChildAnimations());
            } else if (animatorLoadAnimator != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(animatorLoadAnimator);
                afpgVarH = h(arrayList);
            }
        } catch (java.lang.Exception e) {
            android.util.Log.w("MotionSpec", "Can't load animation resource ID #0x".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(i))), e);
        }
        return afpgVarH;
    }

    private static defpackage.afpg h(java.util.List list) {
        defpackage.afpg afpgVar = new defpackage.afpg();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            android.animation.Animator animator = (android.animation.Animator) list.get(i);
            if (!(animator instanceof android.animation.ObjectAnimator)) {
                throw new java.lang.IllegalArgumentException("Animator must be an ObjectAnimator: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(animator))));
            }
            android.animation.ObjectAnimator objectAnimator = (android.animation.ObjectAnimator) animator;
            afpgVar.e(objectAnimator.getPropertyName(), objectAnimator.getValues());
            java.lang.String propertyName = objectAnimator.getPropertyName();
            defpackage.afph afphVar = new defpackage.afph(objectAnimator.getStartDelay(), objectAnimator.getDuration(), objectAnimator.getInterpolator());
            afphVar.a = objectAnimator.getRepeatCount();
            afphVar.b = objectAnimator.getRepeatMode();
            afpgVar.a.put(propertyName, afphVar);
        }
        return afpgVar;
    }

    public final android.animation.ObjectAnimator a(java.lang.String str, java.lang.Object obj, android.util.Property property) {
        android.animation.ObjectAnimator objectAnimatorOfPropertyValuesHolder = android.animation.ObjectAnimator.ofPropertyValuesHolder(obj, g(str));
        objectAnimatorOfPropertyValuesHolder.setProperty(property);
        d(str).b(objectAnimatorOfPropertyValuesHolder);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public final defpackage.afph d(java.lang.String str) {
        aec aecVar = this.a;
        if (aecVar.get(str) != null) {
            return (defpackage.afph) aecVar.get(str);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final void e(java.lang.String str, android.animation.PropertyValuesHolder[] propertyValuesHolderArr) {
        this.b.put(str, propertyValuesHolderArr);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.afpg) {
            return this.a.equals(((defpackage.afpg) obj).a);
        }
        return false;
    }

    public final boolean f(java.lang.String str) {
        return this.b.get(str) != null;
    }

    public final android.animation.PropertyValuesHolder[] g(java.lang.String str) {
        if (!f(str)) {
            throw new java.lang.IllegalArgumentException();
        }
        android.animation.PropertyValuesHolder[] propertyValuesHolderArr = (android.animation.PropertyValuesHolder[]) this.b.get(str);
        android.animation.PropertyValuesHolder[] propertyValuesHolderArr2 = new android.animation.PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i = 0; i < propertyValuesHolderArr.length; i++) {
            propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
        }
        return propertyValuesHolderArr2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "\n" + getClass().getName() + '{' + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }
}
