package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class maq implements android.view.View.OnClickListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ alad c;

    public /* synthetic */ maq(kgu kguVar, defpackage.kma kmaVar, boolean z, int i) {
        this.$cid = i;
        this.c = kguVar;
        this.b = kmaVar;
        this.a = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i;
        switch (this.$cid) {
            case 0:
                boolean z = this.a;
                rmx rmxVar = z ? rmx.vx : rmx.vv;
                mau mauVar = (mau) this.b;
                mauVar.c.o(rmxVar);
                defpackage.jmc.c(mauVar.b, mauVar.n.aq(this.c, true != z ? 2 : 8));
                break;
            case 1:
                alad aladVar = this.c;
                java.lang.Object obj = this.b;
                if (aladVar == null) {
                    defpackage.kma kmaVar = (defpackage.kma) obj;
                    kmaVar.v.o(kmaVar.E ? rmx.hU : rmx.ie);
                    kmaVar.H(kmaVar.E ? mce.eg : mce.dp);
                }
                defpackage.kma kmaVar2 = (defpackage.kma) obj;
                kmaVar2.t.a(kmaVar2.E(), false, this.a, defpackage.nwt.CONVERSATION_HISTORY_LIST_ITEM);
                break;
            case 2:
                boolean z2 = this.a;
                i = z2 ? 8 : 2;
                mau mauVar2 = (mau) this.b;
                defpackage.jjx jjxVarAq = mauVar2.n.aq(this.c, i);
                mauVar2.c.o(z2 ? rmx.ui : rmx.uh);
                defpackage.jmc.b(mauVar2.b, jjxVarAq);
                break;
            case 3:
                boolean z3 = this.a;
                kiu kiuVar = this.c;
                mau mauVar3 = (mau) this.b;
                mauVar3.l.w((zrx) mauVar3.q(kiuVar, z3, true, false).a);
                break;
            case 4:
                boolean z4 = this.a;
                rmw rmwVar = z4 ? rmw.hB : rmw.hf;
                mau mauVar4 = (mau) this.b;
                mauVar4.c.n(rmwVar);
                defpackage.jmc.e(mauVar4.b, mauVar4.n.aq(this.c, true != z4 ? 2 : 8));
                break;
            case 5:
                rmw rmwVar2 = this.a ? rmw.hE : rmw.hn;
                java.lang.Object obj2 = this.b;
                kiu kiuVar2 = this.c;
                mau mauVar5 = (mau) obj2;
                mauVar5.c.n(rmwVar2);
                aoin aoinVar = mauVar5.e;
                kiu kiuVar3 = kiuVar2;
                java.lang.String str = kiuVar3.g;
                if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
                    defpackage.hkd hkdVar = kiuVar3.f;
                    if (hkdVar == null) {
                        hkdVar = defpackage.hkd.a;
                    }
                    java.lang.String str2 = hkdVar.c;
                    if (!str2.isEmpty()) {
                        str = str2;
                    } else if (!kiuVar3.h.isEmpty()) {
                        str = kiuVar3.h;
                    }
                }
                uxw.b(mauVar5.b, wsc.aT(str).addFlags(268435456), 2132017288);
                break;
            case 6:
                boolean z5 = this.a;
                rmw rmwVar3 = z5 ? rmw.hC : rmw.hg;
                mau mauVar6 = (mau) this.b;
                mauVar6.c.n(rmwVar3);
                defpackage.jmc.d(mauVar6.b, mauVar6.n.aq(this.c, true != z5 ? 2 : 8));
                break;
            case 7:
                kgu kguVar = this.c;
                boolean z6 = this.a;
                mau mauVar7 = (mau) this.b;
                j$.util.Optional optionalG = mauVar7.i.g();
                vui vuiVar = new vui(mauVar7, kguVar, z6, 1);
                if (true == optionalG.isPresent()) {
                    java.lang.Object obj3 = optionalG.get();
                    java.lang.Object obj4 = vuiVar.c;
                    java.lang.Object obj5 = vuiVar.b;
                    boolean z7 = vuiVar.a;
                    kgz kgzVar = (kgz) obj3;
                    if (!((java.lang.Boolean) ((mau) obj4).f.a()).booleanValue()) {
                        kgzVar.g(((kgu) obj5).i, 1);
                    } else {
                        kgzVar.g(((kgu) obj5).c, true == z7 ? 3 : 2);
                    }
                }
                break;
            default:
                boolean z8 = this.a;
                i = z8 ? 8 : 2;
                mau mauVar8 = (mau) this.b;
                kiu kiuVar4 = this.c;
                defpackage.jjx jjxVarAq2 = mauVar8.n.aq(kiuVar4, i);
                mauVar8.c.n(z8 ? rmw.hA : rmw.he);
                tkl tklVar = mauVar8.k;
                if (tklVar.u(kiuVar4) || tklVar.t(kiuVar4)) {
                    defpackage.jmc.a(mauVar8.b, jjxVarAq2);
                } else {
                    android.content.Context context = mauVar8.b;
                    defpackage.jmc.a.b().l("com/android/dialer/blockreportspam/ShowBlockReportSpamDialogNotifier", "notifyShowDialogToBlockNumberAndNonCheckedOptionallyReportSpam", 58, "ShowBlockReportSpamDialogNotifier.java").v("enter");
                    android.content.Intent intent = new android.content.Intent();
                    intent.setAction("show_dialog_to_block_number_and_non_checked_optionally_report_spam");
                    sns.u(intent, "dialog_info", jjxVarAq2);
                    epq.a(context).d(intent);
                }
                break;
        }
    }

    public /* synthetic */ maq(mau mauVar, alad aladVar, boolean z, int i) {
        this.$cid = i;
        this.b = mauVar;
        this.c = aladVar;
        this.a = z;
    }

    public /* synthetic */ maq(mau mauVar, boolean z, kiu kiuVar, int i) {
        this.$cid = i;
        this.b = mauVar;
        this.a = z;
        this.c = kiuVar;
    }
}
