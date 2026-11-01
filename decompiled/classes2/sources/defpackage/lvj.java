package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lvj extends android.widget.ArrayAdapter {
    private final int a;
    private final defpackage.lvm b;

    public lvj(android.content.Context context, int i, defpackage.lvm lvmVar) {
        super(context, i, (java.util.List) lvmVar.g);
        this.b = lvmVar;
        this.a = i;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return false;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        tjw tjwVar;
        android.graphics.drawable.Drawable drawableLoadDrawable;
        java.lang.String strA;
        android.graphics.drawable.Icon icon;
        android.view.View viewInflate = view;
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) getContext().getSystemService("layout_inflater");
        int i2 = this.a;
        if (viewInflate == null) {
            viewInflate = layoutInflater.inflate(i2, (android.view.ViewGroup) null);
            tjwVar = new tjw((short[]) null);
            tjwVar.b = (android.widget.TextView) viewInflate.findViewById(2131428433);
            tjwVar.a = (android.widget.TextView) viewInflate.findViewById(2131428594);
            tjwVar.d = (android.widget.TextView) viewInflate.findViewById(2131428332);
            tjwVar.c = (android.widget.ImageView) viewInflate.findViewById(2131428351);
            viewInflate.setTag(i2, tjwVar);
        } else {
            tjwVar = (tjw) viewInflate.getTag(i2);
        }
        defpackage.lvl lvlVar = (defpackage.lvl) getItem(i);
        android.telecom.PhoneAccountHandle phoneAccountHandleBM = mni.bM(lvlVar);
        lvi lviVarBT = mni.bT(getContext());
        j$.util.Optional optionalJ = lviVarBT.dO().j(phoneAccountHandleBM);
        if (optionalJ.isPresent()) {
            android.telecom.PhoneAccount phoneAccount = (android.telecom.PhoneAccount) optionalJ.orElseThrow();
            j$.util.Optional optionalH = lviVarBT.bd().h(phoneAccountHandleBM);
            if (true == optionalH.isPresent()) {
                optionalH = j$.util.Optional.ofNullable(((android.telephony.SubscriptionInfo) optionalH.get()).getDisplayName());
            }
            ((android.widget.TextView) tjwVar.b).setText((java.lang.CharSequence) optionalH.orElse(phoneAccount.getLabel()));
            if (phoneAccount.getAddress() == null) {
                ((android.widget.TextView) tjwVar.a).setVisibility(8);
                defpackage.lvk.ak.b().l("com/android/dialer/contacts/accountselector/AccountSelectorDialogFragment$SelectAccountListAdapter", "getView", 379, "AccountSelectorDialogFragment.java").v("do not show numberTextView because address is null");
                drawableLoadDrawable = null;
            } else {
                java.lang.String schemeSpecificPart = phoneAccount.getAddress().getSchemeSpecificPart();
                if (android.text.TextUtils.isEmpty(schemeSpecificPart)) {
                    if (android.os.Build.VERSION.SDK_INT >= 33) {
                        j$.util.Optional optionalH2 = lviVarBT.bd().h(phoneAccountHandleBM);
                        if (true == optionalH2.isPresent()) {
                            optionalH2 = j$.util.Optional.ofNullable(java.lang.Integer.valueOf(((android.telephony.SubscriptionInfo) optionalH2.get()).getSubscriptionId()));
                        }
                        if (optionalH2.isEmpty()) {
                            defpackage.lvk.ak.d().l("com/android/dialer/contacts/accountselector/AccountSelectorDialogFragment$SelectAccountListAdapter", "getView", 390, "AccountSelectorDialogFragment.java").v("getSchemeSpecificPart is empty. use fallback from SubscriptionManager.getPhoneNumber, but subscriptionId is empty for the phone account");
                        } else {
                            schemeSpecificPart = (java.lang.String) lviVarBT.bd().g(((java.lang.Integer) optionalH2.orElseThrow()).intValue()).orElse("");
                            defpackage.lvk.ak.b().l("com/android/dialer/contacts/accountselector/AccountSelectorDialogFragment$SelectAccountListAdapter", "getView", 400, "AccountSelectorDialogFragment.java").v("getSchemeSpecificPart is empty. use fallback from SubscriptionManager.getPhoneNumber");
                        }
                    } else {
                        j$.util.Optional optionalH3 = lviVarBT.bd().h(phoneAccountHandleBM);
                        if (true == optionalH3.isPresent()) {
                            optionalH3 = j$.util.Optional.ofNullable(((android.telephony.SubscriptionInfo) optionalH3.get()).getNumber());
                        }
                        schemeSpecificPart = (java.lang.String) optionalH3.orElse("");
                        defpackage.lvk.ak.b().l("com/android/dialer/contacts/accountselector/AccountSelectorDialogFragment$SelectAccountListAdapter", "getView", 412, "AccountSelectorDialogFragment.java").v("getSchemeSpecificPart is empty. use fallback from SubscriptionManager.getSubscriptionInfo.getNumber");
                    }
                }
                if (android.text.TextUtils.isEmpty(schemeSpecificPart)) {
                    ((android.widget.TextView) tjwVar.a).setVisibility(8);
                    defpackage.lvk.ak.b().l("com/android/dialer/contacts/accountselector/AccountSelectorDialogFragment$SelectAccountListAdapter", "getView", 420, "AccountSelectorDialogFragment.java").v("do not show numberTextView because number is empty");
                    drawableLoadDrawable = null;
                } else {
                    ((android.widget.TextView) tjwVar.a).setVisibility(0);
                    ssq ssqVarBP = lviVarBT.bP();
                    android.content.Context context = getContext();
                    j$.util.Optional optionalH4 = mni.bT(context).bd().h(phoneAccountHandleBM);
                    if (optionalH4.isPresent()) {
                        drawableLoadDrawable = null;
                        java.lang.String countryIso = ((android.telephony.SubscriptionInfo) optionalH4.orElseThrow()).getCountryIso();
                        strA = android.text.TextUtils.isEmpty(countryIso) ? rlt.a(context, (android.telecom.PhoneAccountHandle) null) : ahvr.q(countryIso);
                    } else {
                        drawableLoadDrawable = null;
                        strA = rlt.a(context, (android.telecom.PhoneAccountHandle) null);
                    }
                    java.lang.CharSequence charSequenceA = ssqVarBP.a(schemeSpecificPart, strA);
                    ((android.widget.TextView) tjwVar.a).setText(charSequenceA);
                    aimw aimwVarL = defpackage.lvk.ak.b().l("com/android/dialer/contacts/accountselector/AccountSelectorDialogFragment$SelectAccountListAdapter", "getView", 429, "AccountSelectorDialogFragment.java");
                    lviVarBT.ji();
                    aimwVarL.y("show numberTextView with %s", aais.aD(charSequenceA));
                }
            }
            java.lang.Object obj = tjwVar.c;
            android.content.Context context2 = getContext();
            if (phoneAccount != null && context2 != null && (icon = phoneAccount.getIcon()) != null) {
                drawableLoadDrawable = icon.loadDrawable(context2);
            }
            ((android.widget.ImageView) obj).setImageDrawable(drawableLoadDrawable);
            if (android.text.TextUtils.isEmpty(lvlVar.e)) {
                ((android.widget.TextView) tjwVar.d).setVisibility(8);
            } else {
                ((android.widget.TextView) tjwVar.d).setVisibility(0);
                ((android.widget.TextView) tjwVar.d).setText(lvlVar.e);
            }
            ((android.widget.TextView) tjwVar.b).setEnabled(lvlVar.f);
            ((android.widget.TextView) tjwVar.a).setEnabled(lvlVar.f);
            ((android.widget.TextView) tjwVar.d).setEnabled(lvlVar.f);
            ((android.widget.ImageView) tjwVar.c).setImageAlpha(true != lvlVar.f ? 97 : 255);
        }
        return viewInflate;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return ((defpackage.lvl) this.b.g.get(i)).f;
    }
}
