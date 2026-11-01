package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vgt implements ajbc {
    public final /* synthetic */ vgu a;
    public final /* synthetic */ android.telecom.PhoneAccountHandle b;

    public /* synthetic */ vgt(vgu vguVar, android.telecom.PhoneAccountHandle phoneAccountHandle) {
        this.a = vguVar;
        this.b = phoneAccountHandle;
    }

    public final java.lang.Object a(ajyk ajykVar, java.lang.Object obj) {
        int iIntValue;
        int i;
        int i2;
        int i3;
        vgu vguVar = this.a;
        android.net.Network network = (android.net.Network) obj;
        java.lang.String str = vguVar.j.c.h;
        if (android.text.TextUtils.isEmpty(str)) {
            iIntValue = 0;
            i = 0;
        } else {
            iIntValue = java.lang.Integer.valueOf(str).intValue();
            i = 0;
        }
        defpackage.vgi vgiVar = vguVar.j;
        vbu vbuVar = vgiVar.a;
        int i4 = (vbuVar.b & 512) != 0 ? vbuVar.m : i;
        android.telecom.PhoneAccountHandle phoneAccountHandle = this.b;
        java.util.concurrent.Executor executor = vguVar.b;
        ajct ajctVar = vguVar.d;
        ajct ajctVar2 = vguVar.c;
        int i5 = i;
        android.content.Context context = vguVar.a;
        if (i4 != 0) {
            i3 = i4;
            i2 = i3;
        } else {
            i2 = iIntValue;
            i3 = i4;
        }
        rsr rsrVar = vguVar.l;
        defpackage.vgm vgmVar = vgiVar.c;
        defpackage.vgs vgsVar = new defpackage.vgs(context, ajctVar2, ajctVar, executor, new defpackage.vid(context, vgiVar, rsrVar, vgmVar.e, vgmVar.f, i2, vgmVar.g, i3 != 0 ? 1 : i5, network), vgiVar, phoneAccountHandle, vguVar.h, vguVar.e, vguVar.f, vguVar.k, vguVar.g);
        ajykVar.o(vgsVar, executor);
        return vgsVar;
    }
}
