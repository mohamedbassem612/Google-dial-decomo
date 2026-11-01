package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ops {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/glidephotomanager/impl/GlidePhotoManagerImpl");
    public final defpackage.ahhp b;
    public final android.content.Context c;
    public final defpackage.aoin d;
    public final defpackage.ajct e;
    public final java.util.Set f = java.util.Collections.newSetFromMap(new j$.util.concurrent.ConcurrentHashMap());
    private final defpackage.aoin g;
    private final defpackage.aoin h;
    private final defpackage.rsr i;
    private final defpackage.ipc j;

    public ops(defpackage.ahhp ahhpVar, android.content.Context context, defpackage.rsr rsrVar, defpackage.ipc ipcVar, defpackage.ajct ajctVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3) {
        this.b = ahhpVar;
        this.c = context;
        this.i = rsrVar;
        this.j = ipcVar;
        this.d = aoinVar;
        this.g = aoinVar2;
        this.h = aoinVar3;
        this.e = ajctVar;
    }

    public static android.net.Uri b(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        return android.net.Uri.parse(str);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0068  */
    public final android.graphics.drawable.Drawable a(abwd abwdVar, boolean z) {
        int iC;
        if (!abwdVar.g.isEmpty() && !abwdVar.c.isEmpty()) {
            opt optVar = opt.a;
            if (opt.b(abwdVar.c.charAt(0))) {
                return this.i.D(new opm(abwdVar.c.charAt(0)), opt.a(abwdVar));
            }
        }
        opk opkVarBn = this.j.bn(2131231538, 0.6f);
        if (z) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = this.c.obtainStyledAttributes(new int[]{2130969598});
            try {
                boolean z2 = typedArrayObtainStyledAttributes.getBoolean(0, false);
                typedArrayObtainStyledAttributes.recycle();
                if (z2) {
                    iC = defpackage.urg.c(this.c, 2130969109);
                } else {
                    iC = defpackage.urg.c(this.c, 2130969108);
                }
            } catch (java.lang.Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            iC = defpackage.urg.c(this.c, 2130969108);
        }
        return new opn(opkVarBn, defpackage.urg.c(this.c, 2130969068), iC);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final ahhk c(android.widget.ImageView imageView, abwd abwdVar) {
        xsx xsxVarB;
        imageView.setContentDescription(android.text.TextUtils.expandTemplate(this.c.getText(2132017214), defpackage.pez.aq(imageView.getContext(), abwdVar.c)));
        yds ydsVarD = xrr.d(imageView.getContext());
        if (ygc.i()) {
            xsxVarB = ydsVarD.b(imageView.getContext().getApplicationContext());
        } else {
            defpackage.anty.aI(imageView, "Argument must not be null");
            defpackage.anty.aI(imageView.getContext(), "Unable to obtain a request manager for a view without a Context");
            android.app.Activity activityA = yds.a(imageView.getContext());
            if (activityA != null && (activityA instanceof defpackage.az)) {
                defpackage.az azVar = (defpackage.az) activityA;
                defpackage.aca acaVar = ydsVarD.a;
                acaVar.clear();
                yds.e(azVar.a().k(), acaVar);
                android.view.View viewFindViewById = azVar.findViewById(android.R.id.content);
                defpackage.aw awVar = null;
                for (android.view.View view = imageView; !view.equals(viewFindViewById) && (awVar = (defpackage.aw) acaVar.get(view)) == null && (view.getParent() instanceof android.view.View); view = (android.view.View) view.getParent()) {
                }
                acaVar.clear();
                xsxVarB = awVar != null ? ydsVarD.c(awVar) : ydsVarD.d(azVar);
            } else {
                xsxVarB = ydsVarD.b(imageView.getContext().getApplicationContext());
            }
        }
        return ((ahhl) xsxVarB).r(android.graphics.drawable.Drawable.class);
    }

    public final ahhk d(ahhk ahhkVar, abwd abwdVar) {
        defpackage.aoin aoinVar = this.h;
        float f = true != ((java.lang.Boolean) aoinVar.a()).booleanValue() ? 0.7f : 0.6f;
        switch (defpackage.pez.au(abwdVar) - 1) {
            case 0:
                opk opkVarBn = this.j.bn(2131231051, f);
                android.content.Context context = this.c;
                return ahhkVar.V(new opn(opkVarBn, defpackage.urg.c(context, 2130968958), defpackage.urg.c(context, 2130969107)));
            case 1:
                defpackage.aoin aoinVar2 = this.g;
                boolean zBooleanValue = ((java.lang.Boolean) aoinVar2.a()).booleanValue();
                android.content.Context context2 = this.c;
                int iC = zBooleanValue ? defpackage.urg.c(context2, 2130968953) : defpackage.urg.c(context2, 2130968948);
                boolean zBooleanValue2 = ((java.lang.Boolean) aoinVar2.a()).booleanValue();
                android.content.Context context3 = this.c;
                return ahhkVar.V(new opn(this.j.bn(2131232046, true != ((java.lang.Boolean) aoinVar.a()).booleanValue() ? 0.75f : 0.6f), iC, zBooleanValue2 ? defpackage.urg.c(context3, 2130969115) : defpackage.urg.c(context3, 2130969054)));
            case 2:
                return ahhkVar.V(this.i.D(this.j.bn(2131232065, f), null));
            case 3:
                defpackage.rsr rsrVar = this.i;
                opk opkVarBn2 = this.j.bn(2131232015, f);
                opt optVar = opt.a;
                return ahhkVar.V(rsrVar.D(opkVarBn2, opt.a(abwdVar)));
            case 4:
                return ahhkVar.V(this.i.D(this.j.bn(2131232033, f), null));
            case 5:
                opk opkVarBn3 = this.j.bn(2131231407, f);
                android.content.Context context4 = this.c;
                return ahhkVar.V(new opn(opkVarBn3, defpackage.urg.c(context4, 2130969054), defpackage.urg.c(context4, 2130968948)));
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return ahhkVar.W(b(abwdVar.e)).T(xwm.c);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return ahhkVar.W(android.content.ContentUris.withAppendedId(android.provider.ContactsContract.Data.CONTENT_URI, abwdVar.f));
            default:
                return ahhkVar.X((java.lang.Object) null);
        }
    }

    public final defpackage.ajcq e(abwd abwdVar, oph ophVar, int i, int i2) {
        return defpackage.dff.m(new opp(this, abwdVar, i, i2, ophVar));
    }

    public final void f(android.widget.ImageView imageView, abwd abwdVar, boolean z) {
        akcu akcuVar = new akcu();
        akcuVar.f();
        akcuVar.g(true);
        akcuVar.h(true);
        g(imageView, abwdVar, akcuVar.e(), z);
    }

    public final void g(android.widget.ImageView imageView, abwd abwdVar, oph ophVar, boolean z) {
        defpackage.gus.aI();
        ahhk ahhkVarD = d(c(imageView, abwdVar), abwdVar);
        i(ahhkVarD, abwdVar, ophVar, z);
        ahhkVarD.m(imageView);
    }

    public final void h(android.widget.QuickContactBadge quickContactBadge, abwd abwdVar, boolean z) {
        defpackage.gus.aI();
        android.net.Uri uriW = android.net.Uri.parse(abwdVar.g);
        if (uriW.equals(android.net.Uri.EMPTY)) {
            uriW = defpackage.pez.av(abwdVar);
        } else if ((abwdVar.b & 32768) != 0 && abxl.d(uriW)) {
            try {
                vaa vaaVarE = abxl.E(uriW);
                abvq abvqVar = abwdVar.p;
                if (abvqVar == null) {
                    abvqVar = abvq.a;
                }
                vaaVarE.Y(abvqVar);
                uriW = vaaVarE.W();
            } catch (org.json.JSONException e) {
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).k(e)).l("com/android/dialer/glidephotomanager/impl/GlidePhotoManagerImpl", "getLookupUri", (char) 164, "GlidePhotoManagerImpl.java")).v("Failed to parse encoded contact URI.");
            }
        }
        quickContactBadge.assignContactUri(uriW);
        quickContactBadge.setOverlay(null);
        f(quickContactBadge, abwdVar, z);
    }

    public final void i(ahhk ahhkVar, abwd abwdVar, oph ophVar, boolean z) {
        android.graphics.drawable.Drawable drawableA = a(abwdVar, z);
        if (ophVar.b) {
            ahhkVar.Z(drawableA);
        }
        if (ophVar.c) {
            ahhkVar.U(drawableA);
        }
        if (ophVar.a) {
            ahhkVar.ab();
        }
    }
}
