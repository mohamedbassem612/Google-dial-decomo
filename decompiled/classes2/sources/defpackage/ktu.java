package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ktu implements defpackage.ktw {
    private final zzd a;
    private final android.content.Intent b;
    private final java.lang.String c;
    private final android.content.Context d;
    private final zdi e;

    public ktu(android.content.Intent intent, zzd zzdVar, java.lang.String str, android.content.Context context, zdi zdiVar) {
        this.b = intent;
        this.a = zzdVar;
        this.c = str;
        this.d = context;
        this.e = zdiVar;
    }

    private static java.lang.String d(android.content.Intent intent) {
        return intent.getBundleExtra("call_info_bundle").getString("com.google.android.ims.client_call_id", "");
    }

    private final void e(aldw aldwVar) {
        if (this.c.equals("NOVA_VOICE")) {
            akzx akzxVarM = aiwa.a.m();
            akzxVarM.u();
            aiwa aiwaVar = akzxVarM.b;
            j$.util.Objects.requireNonNull(aldwVar);
            aiwaVar.c = aldwVar;
            aiwaVar.b = 19;
            this.e.d(this.a.h(akzxVarM.p(), abtl.b(this.d, new defpackage.aivz())));
            return;
        }
        akzx akzxVarM2 = aiux.a.m();
        akzxVarM2.u();
        aiux aiuxVar = akzxVarM2.b;
        j$.util.Objects.requireNonNull(aldwVar);
        aiuxVar.c = aldwVar;
        aiuxVar.b = 29;
        this.e.d(this.a.h(akzxVarM2.p(), abtl.b(this.d, new defpackage.aiuw())));
    }

    @Override // defpackage.ktw
    public final void a() {
        akzx akzxVarM = aldw.a.m();
        akzxVarM.u();
        aldw aldwVar = akzxVarM.b;
        aldwVar.d = 2;
        aldwVar.b |= 4;
        android.content.Intent intent = this.b;
        if (d(intent).isEmpty()) {
            return;
        }
        java.lang.String strD = d(intent);
        akzxVarM.u();
        aldw aldwVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(strD);
        aldwVar2.b |= 1;
        aldwVar2.c = strD;
        e((aldw) akzxVarM.p());
    }

    @Override // defpackage.ktw
    public final void b(java.lang.String str, android.content.res.Resources resources) {
        akzx akzxVarM = aldw.a.m();
        akzxVarM.u();
        aldw aldwVar = akzxVarM.b;
        aldwVar.d = 1;
        aldwVar.b |= 4;
        if (str.contentEquals(resources.getText(2132018697))) {
            akzxVarM.u();
            aldw aldwVar2 = akzxVarM.b;
            aldwVar2.e = 2;
            aldwVar2.b |= 8;
        } else if (str.contentEquals(resources.getText(2132018696))) {
            akzxVarM.u();
            aldw aldwVar3 = akzxVarM.b;
            aldwVar3.e = 1;
            aldwVar3.b |= 8;
        } else if (str.contentEquals(resources.getText(2132018695))) {
            akzxVarM.u();
            aldw aldwVar4 = akzxVarM.b;
            aldwVar4.e = 4;
            aldwVar4.b |= 8;
        } else if (str.contentEquals(resources.getText(2132018688))) {
            akzxVarM.u();
            aldw aldwVar5 = akzxVarM.b;
            aldwVar5.e = 5;
            aldwVar5.b |= 8;
        } else if (str.contentEquals(resources.getText(2132018699))) {
            akzxVarM.u();
            aldw aldwVar6 = akzxVarM.b;
            aldwVar6.e = 3;
            aldwVar6.b |= 8;
        } else if (str.contentEquals(resources.getText(2132018686))) {
            akzxVarM.u();
            aldw aldwVar7 = akzxVarM.b;
            aldwVar7.e = 7;
            aldwVar7.b |= 8;
        }
        android.content.Intent intent = this.b;
        if (d(intent).isEmpty()) {
            return;
        }
        java.lang.String strD = d(intent);
        akzxVarM.u();
        aldw aldwVar8 = akzxVarM.b;
        j$.util.Objects.requireNonNull(strD);
        aldwVar8.b |= 1;
        aldwVar8.c = strD;
        e((aldw) akzxVarM.p());
    }

    @Override // defpackage.ktw
    public final void c() {
        akzx akzxVarM = aldx.a.m();
        java.lang.String strD = d(this.b);
        akzxVarM.u();
        aldx aldxVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(strD);
        aldxVar.b |= 1;
        aldxVar.c = strD;
        akzxVarM.u();
        aldx aldxVar2 = akzxVarM.b;
        aldxVar2.d = 39;
        aldxVar2.b |= 64;
        aldx aldxVarP = akzxVarM.p();
        if (this.c.equals("NOVA_VOICE")) {
            akzx akzxVarM2 = aiwa.a.m();
            akzxVarM2.u();
            aiwa aiwaVar = akzxVarM2.b;
            j$.util.Objects.requireNonNull(aldxVarP);
            aiwaVar.c = aldxVarP;
            aiwaVar.b = 9;
            this.e.d(this.a.h(akzxVarM2.p(), abtl.b(this.d, new defpackage.aivz())));
            return;
        }
        akzx akzxVarM3 = aiux.a.m();
        akzxVarM3.u();
        aiux aiuxVar = akzxVarM3.b;
        j$.util.Objects.requireNonNull(aldxVarP);
        aiuxVar.c = aldxVarP;
        aiuxVar.b = 10;
        this.e.d(this.a.h(akzxVarM3.p(), abtl.b(this.d, new defpackage.aiuw())));
    }
}
