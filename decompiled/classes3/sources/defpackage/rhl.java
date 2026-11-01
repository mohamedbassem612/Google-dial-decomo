package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rhl extends al implements android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener {
    private int ak;
    private java.util.List al;
    private jxb am;
    private boolean an;

    public final android.app.Dialog eb(android.os.Bundle bundle) {
        az azVarG = G();
        ahvr.bY(azVarG instanceof com.android.dialer.shortcuts.CallContactActivity);
        this.al = ((aw) this).m.getParcelableArrayList("phoneList");
        this.ak = ((aw) this).m.getInt("interactionType");
        this.an = ((aw) this).m.getBoolean("is_video_call");
        this.am = jxa.a(((aw) this).m);
        defpackage.rhm rhmVar = new defpackage.rhm(azVarG, this.al, this.ak);
        android.view.View viewInflate = azVarG.getLayoutInflater().inflate(2131624431, (android.view.ViewGroup) null);
        defpackage.afsn afsnVar = new defpackage.afsn(azVarG, 0);
        afsnVar.o(rhmVar, this);
        afsnVar.x(this.ak == 2 ? 2132020152 : 2132017653);
        afsnVar.A(viewInflate);
        return afsnVar.create();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        da daVarG = G();
        if (daVarG != null) {
            cy cyVar = (cy) dialogInterface;
            if (this.al.size() <= i || i < 0) {
                dialogInterface.dismiss();
                return;
            }
            com.android.dialer.interactions.PhoneNumberInteraction$PhoneItem phoneNumberInteraction$PhoneItem = (com.android.dialer.interactions.PhoneNumberInteraction$PhoneItem) this.al.get(i);
            if (((android.widget.CheckBox) cyVar.findViewById(2131428925)).isChecked()) {
                int iE = hmr.e(this.am.d);
                if (iE != 0 && iE == 4) {
                    pez.bl(z()).bt().C(30);
                }
                long j = phoneNumberInteraction$PhoneItem.a;
                android.content.Intent intent = new android.content.Intent((android.content.Context) daVarG, (java.lang.Class<?>) com.android.dialer.interactions.ContactUpdateService.class);
                intent.putExtra("phone_number_data_id", j);
                daVarG.startService(intent);
            }
            defpackage.rho.a(daVarG, phoneNumberInteraction$PhoneItem.b, this.ak, this.an, this.am);
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        com.android.dialer.shortcuts.CallContactActivity callContactActivity = (da) G();
        if (callContactActivity != null) {
            callContactActivity.finish();
        }
    }
}
