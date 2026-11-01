package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
class rvy implements agtk {
    final /* synthetic */ defpackage.rvz a;

    public rvy(defpackage.rvz rvzVar) {
        j$.util.Objects.requireNonNull(rvzVar);
        this.a = rvzVar;
    }

    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) {
        throw new defpackage.ahzr(java.lang.String.format("failed to get the PrefActionType for %s", (java.lang.String) obj), th);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [android.content.Context, com.android.dialer.multibindingsettings.impl.DialerSettingsActivity] */
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        int i;
        defpackage.ruy ruyVarA = ((com.google.protobuf.contrib.android.ProtoParsers.ParcelableProto) obj2).a(defpackage.ruy.a, akzq.a());
        defpackage.rvz rvzVar = this.a;
        rvd rvdVar = (rvd) ((aoin) rvzVar.n.k().get(rvzVar.i.get(rvzVar.f.l((java.lang.String) obj)))).a();
        aw awVar = rvzVar.d;
        ?? r1 = (com.android.dialer.multibindingsettings.impl.DialerSettingsActivity) awVar.G();
        int i2 = ruyVarA.b;
        if (i2 == 0) {
            i = 3;
        } else if (i2 != 1) {
            i = 2;
            if (i2 != 2) {
                i = 0;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            throw null;
        }
        int i3 = i - 1;
        if (i3 != 0) {
            if (i3 == 1) {
                ahqx.l((android.content.Context) r1, rvdVar.a());
                return;
            }
            return;
        }
        aw awVarB = rvdVar.b();
        com.android.dialer.multibindingsettings.impl.DialerSettingsActivity dialerSettingsActivity = r1.y().b;
        u uVar = new u(dialerSettingsActivity.a());
        uVar.q(2131428302, awVarB, (java.lang.String) null);
        ((bw) uVar).i = 4099;
        uVar.o((java.lang.String) null);
        uVar.i(false, true);
        dialerSettingsActivity.a().af();
        android.support.v7.widget.RecyclerView recyclerViewFindViewById = awVarB.Q.findViewById(2131428773);
        if (recyclerViewFindViewById != null) {
            rvzVar.m.a(awVar, recyclerViewFindViewById);
        }
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
