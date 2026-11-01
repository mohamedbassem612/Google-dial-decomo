package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class jsg implements afii {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ jsg(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    public final void a(adag adagVar) {
        switch (this.$cid) {
            case 0:
                aimz aimzVar = jsk.a;
                adagVar.k("caller_id_feedback", (android.content.ContentValues) this.a, 5);
                return;
            case 1:
                aimz aimzVar2 = jsk.a;
                adagVar.x(((wsk) this.a).h());
                return;
            case 2:
                aimz aimzVar3 = jwu.a;
                adagVar.x(((wsk) this.a).h());
                return;
            case 3:
                aimz aimzVar4 = lbl.a;
                adagVar.k("call_recording_info", (android.content.ContentValues) this.a, 5);
                return;
            case 4:
                aimz aimzVar5 = lbl.a;
                adagVar.x(((wsk) this.a).h());
                return;
            case 5:
                ?? r7 = this.a;
                aimz aimzVar6 = defpackage.nzg.a;
                adagVar.x(new wsk("eligibility_expansion").h());
                if (r7.isEmpty()) {
                    defpackage.nzg.a.b().l("com/android/dialer/eligibilityexpansion/EligibilityExpansionDatabase", "insertAll", 152, "EligibilityExpansionDatabase.java").v("No data to insert.");
                    return;
                }
                for (java.util.List list : ahvr.bf((java.lang.Iterable) r7, 499)) {
                    adag adagVar2 = new adag((byte[]) null);
                    adagVar2.n("INSERT OR REPLACE INTO eligibility_expansion (phone_number, eligibility_details) VALUES");
                    for (int i = 0; i < list.size() - 1; i++) {
                        adagVar2.n(" (?, ?),");
                    }
                    adagVar2.n(" (?, ?)");
                    afih afihVarZ = adagVar.z(adagVar2.B());
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        try {
                            defpackage.nzc nzcVar = (defpackage.nzc) list.get(i2);
                            int i3 = i2 << 1;
                            afihVarZ.b(i3 + 1, nzcVar.c);
                            afihVarZ.a(i3 + 2, nzcVar.i());
                        } catch (java.lang.Throwable th) {
                            try {
                                afihVarZ.close();
                                break;
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    afihVarZ.d();
                    afihVarZ.close();
                }
                return;
            case 6:
                int i4 = onv.c;
                adagVar.x(((wsk) this.a).h());
                return;
            default:
                int i5 = onv.c;
                adagVar.k("fides", (android.content.ContentValues) this.a, 5);
                return;
        }
    }
}
