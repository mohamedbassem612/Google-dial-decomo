package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lvk extends defpackage.al {
    public static final aimz ak = aimz.i("com/android/dialer/contacts/accountselector/AccountSelectorDialogFragment");
    public defpackage.lvm al = defpackage.lvm.a;
    public boolean am;
    public boolean an;
    public defpackage.ve ao;

    public static android.app.Dialog aU(android.content.Context context, az azVar, defpackage.lvm lvmVar, android.content.DialogInterface.OnClickListener onClickListener, boolean z, android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        afsn afsnVar = new afsn(azVar, 0);
        if (aZ(context)) {
            android.view.View viewInflate = android.view.LayoutInflater.from(afsnVar.getContext()).inflate(2131623970, (android.view.ViewGroup) null);
            ((android.widget.TextView) viewInflate.findViewById(2131427390)).setText(aY(lvmVar));
            afsnVar.n(viewInflate);
        } else {
            afsnVar.x(aY(lvmVar));
        }
        android.content.Context context2 = afsnVar.getContext();
        afsnVar.o(new defpackage.lvj(context2, true != aZ(context2) ? 2131624422 : 2131624423, lvmVar), onClickListener);
        defpackage.cy cyVarCreate = afsnVar.create();
        if (!aZ(context) && lvmVar.d) {
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) android.view.LayoutInflater.from(afsnVar.getContext()).inflate(2131624124, (android.view.ViewGroup) null);
            android.widget.CheckBox checkBox = (android.widget.CheckBox) linearLayout.findViewById(2131427927);
            checkBox.setOnCheckedChangeListener(onCheckedChangeListener);
            checkBox.setChecked(z);
            ((android.widget.TextView) linearLayout.findViewById(2131427926)).setText((lvmVar.b & 4) != 0 ? lvmVar.e : 2132020080);
            ((android.widget.TextView) linearLayout.findViewById(2131427924)).setText((lvmVar.b & 16) != 0 ? lvmVar.h : 2132020081);
            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) linearLayout.findViewById(2131427925);
            linearLayout2.setOnClickListener(new defpackage.lde(checkBox, 12));
            linearLayout2.setAccessibilityDelegate(new defpackage.lvg(checkBox));
            cyVarCreate.d().addFooterView(linearLayout);
        }
        return cyVarCreate;
    }

    public static void aW(android.content.Context context, android.app.Dialog dialog) {
        android.view.View viewFindViewById;
        mni.bT(context).bv().m(ruc.aN);
        if (!aZ(context) || (viewFindViewById = dialog.findViewById(2131429286)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public static defpackage.lvk aX(defpackage.lvm lvmVar, defpackage.ve veVar) {
        defpackage.lvk lvkVar = new defpackage.lvk();
        lvkVar.ao = veVar;
        android.os.Bundle bundle = new android.os.Bundle();
        sns.v(bundle, "options", lvmVar);
        lvkVar.au(bundle);
        return lvkVar;
    }

    private static int aY(defpackage.lvm lvmVar) {
        if ((lvmVar.b & 1) != 0) {
            return lvmVar.c;
        }
        return 2132020060;
    }

    private static boolean aZ(android.content.Context context) {
        return mni.bT(context).ce().a(context) && ((java.lang.Boolean) mni.bT(context).hJ().a()).booleanValue();
    }

    public final java.lang.String aV() {
        return this.al.f;
    }

    @Override // defpackage.al
    public final android.app.Dialog eb(android.os.Bundle bundle) {
        this.al = sns.s(((aw) this).m, "options", defpackage.lvm.a);
        if (bundle != null) {
            this.am = bundle.getBoolean("is_default_checked");
        }
        this.an = false;
        return aU(z(), G(), this.al, new defpackage.ktq(this, 8), this.am, new defpackage.gfe(this, 4));
    }

    @Override // defpackage.al
    public final void k(android.os.Bundle bundle) {
        super.k(bundle);
        bundle.putBoolean("is_default_checked", this.am);
    }

    @Override // defpackage.al
    public final void l() {
        super.l();
        aW(z(), this.d);
    }

    @Override // defpackage.al, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        if (!this.an && this.ao != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("extra_call_id", aV());
            this.ao.c(2, bundle, this);
        }
        ahvr.g(new defpackage.lvh(), G());
        super.onDismiss(dialogInterface);
    }
}
