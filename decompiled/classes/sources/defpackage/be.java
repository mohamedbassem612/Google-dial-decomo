package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class be implements android.view.LayoutInflater.Factory2 {
    public final defpackage.bo a;

    public be(defpackage.bo boVar) {
        this.a = boVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        defpackage.bt btVarJ;
        if (android.support.v4.app.FragmentContainerView.class.getName().equals(str)) {
            return new android.support.v4.app.FragmentContainerView(context, attributeSet, this.a);
        }
        if ("fragment".equals(str)) {
            java.lang.String attributeValue = attributeSet.getAttributeValue(null, "class");
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.t.a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            java.lang.String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                java.lang.ClassLoader classLoader = context.getClassLoader();
                int i = defpackage.bc.a;
                try {
                    if (defpackage.aw.class.isAssignableFrom(defpackage.bc.a(classLoader, attributeValue))) {
                        int id = view != null ? view.getId() : 0;
                        if (id == -1) {
                            if (resourceId != -1) {
                                id = -1;
                            } else {
                                if (string == null) {
                                    throw new java.lang.IllegalArgumentException(defpackage.a.bn(attributeValue, attributeSet, ": Must specify unique android:id, android:tag, or have a parent with an id for "));
                                }
                                id = -1;
                                resourceId = -1;
                            }
                        }
                        defpackage.aw awVarD = resourceId != -1 ? this.a.d(resourceId) : null;
                        if (awVarD == null && string != null) {
                            awVarD = this.a.e(string);
                        }
                        if (awVarD == null && id != -1) {
                            awVarD = this.a.d(id);
                        }
                        if (awVarD == null) {
                            defpackage.bo boVar = this.a;
                            defpackage.bc bcVarH = boVar.h();
                            context.getClassLoader();
                            awVarD = bcVarH.b(attributeValue);
                            awVarD.v = true;
                            awVarD.F = resourceId != 0 ? resourceId : id;
                            awVarD.G = id;
                            awVarD.H = string;
                            awVarD.w = true;
                            awVarD.B = boVar;
                            awVarD.C = boVar.n;
                            android.content.Context context2 = boVar.n.c;
                            android.os.Bundle bundle = awVarD.h;
                            awVarD.aN();
                            btVarJ = boVar.i(awVarD);
                            if (defpackage.bo.Z(2)) {
                                android.util.Log.v("FragmentManager", "Fragment " + awVarD + " has been inflated via the <fragment> tag: id=0x" + java.lang.Integer.toHexString(resourceId));
                            }
                        } else {
                            if (awVarD.w) {
                                throw new java.lang.IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + java.lang.Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + java.lang.Integer.toHexString(id) + " with another fragment for " + attributeValue);
                            }
                            awVarD.w = true;
                            defpackage.bo boVar2 = this.a;
                            awVarD.B = boVar2;
                            awVarD.C = boVar2.n;
                            android.content.Context context3 = boVar2.n.c;
                            awVarD.aN();
                            btVarJ = boVar2.j(awVarD);
                            if (defpackage.bo.Z(2)) {
                                android.util.Log.v("FragmentManager", "Retained Fragment " + awVarD + " has been re-attached via the <fragment> tag: id=0x" + java.lang.Integer.toHexString(resourceId));
                            }
                        }
                        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                        int i2 = eku.a;
                        if (awVarD == null) {
                            defpackage.aooh.i("fragment");
                        }
                        ekv ekvVar = new ekv(awVarD, viewGroup);
                        eku.d(ekvVar);
                        ekt ektVarB = eku.b(awVarD);
                        if (ektVarB.b.contains(eks.d) && eku.e(ektVarB, awVarD.getClass(), ekvVar.getClass())) {
                            eku.c(ektVarB, ekvVar);
                        }
                        awVarD.P = viewGroup;
                        btVarJ.e();
                        btVarJ.d();
                        android.view.View view2 = awVarD.Q;
                        if (view2 == null) {
                            throw new java.lang.IllegalStateException(defpackage.a.bk(attributeValue, "Fragment ", " did not create a view."));
                        }
                        if (resourceId != 0) {
                            view2.setId(resourceId);
                        }
                        if (awVarD.Q.getTag() == null) {
                            awVarD.Q.setTag(string);
                        }
                        awVarD.Q.addOnAttachStateChangeListener(new eca(this, btVarJ, 1));
                        return awVarD.Q;
                    }
                } catch (java.lang.ClassNotFoundException unused) {
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
