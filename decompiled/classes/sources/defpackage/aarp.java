package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aarp extends defpackage.aada implements defpackage.aarf {
    private static final defpackage.acxg a;
    private static final defpackage.aais l;

    static {
        defpackage.aarh aarhVar = new defpackage.aarh();
        l = aarhVar;
        a = new defpackage.acxg("People.API", aarhVar, new defpackage.aais());
    }

    public aarp(android.content.Context context, defpackage.aaqm aaqmVar) {
        super(context, null, a, aaqmVar, defpackage.aacz.a);
    }

    @Override // defpackage.aarf
    public final defpackage.aaum a(com.google.android.gms.people.cpg.callingcard.CreateCallingCardRequest createCallingCardRequest) {
        defpackage.aafq aafqVar = new defpackage.aafq();
        aafqVar.a = new aarg(this, createCallingCardRequest, 1);
        aafqVar.b = new com.google.android.gms.common.Feature[]{defpackage.aaqf.y};
        aafqVar.c = 2738;
        return super.i(1, aafqVar.a());
    }

    @Override // defpackage.aarf
    public final defpackage.aaum b(java.util.List list) {
        defpackage.aafq aafqVar = new defpackage.aafq();
        aafqVar.a = new zxc(this, list, 19);
        aafqVar.b = new com.google.android.gms.common.Feature[]{defpackage.aaqf.y};
        aafqVar.c = 2741;
        return super.i(1, aafqVar.a());
    }

    @Override // defpackage.aarf
    public final defpackage.aaum c(java.util.List list) {
        defpackage.aafq aafqVar = new defpackage.aafq();
        aafqVar.a = new zxc(this, list, 17);
        aafqVar.b = new com.google.android.gms.common.Feature[]{defpackage.aaqf.y};
        aafqVar.c = 2747;
        return super.i(1, aafqVar.a());
    }

    @Override // defpackage.aarf
    public final defpackage.aaum d(java.util.List list) {
        defpackage.aafq aafqVar = new defpackage.aafq();
        aafqVar.a = new zxc(this, list, 16);
        aafqVar.b = new com.google.android.gms.common.Feature[]{defpackage.aaqf.y};
        aafqVar.c = 2739;
        return super.i(1, aafqVar.a());
    }

    @Override // defpackage.aarf
    public final defpackage.aaum e(java.util.List list) {
        defpackage.aafq aafqVar = new defpackage.aafq();
        aafqVar.a = new aarg(this, list, 0);
        aafqVar.b = new com.google.android.gms.common.Feature[]{defpackage.aaqf.y};
        aafqVar.c = 2746;
        return super.i(1, aafqVar.a());
    }

    @Override // defpackage.aarf
    public final defpackage.aaum g(com.google.android.gms.people.cpg.callingcard.v2.PurgeCallingCardsRequest purgeCallingCardsRequest) {
        defpackage.aafq aafqVar = new defpackage.aafq();
        aafqVar.a = new zxc(this, purgeCallingCardsRequest, 18);
        aafqVar.b = new com.google.android.gms.common.Feature[]{defpackage.aaqf.y};
        aafqVar.c = 2748;
        return super.i(1, aafqVar.a());
    }

    @Override // defpackage.aarf
    public final defpackage.aaum h(com.google.android.gms.people.cpg.callingcard.v2.UpsertCallingCardRequest upsertCallingCardRequest) {
        defpackage.aafq aafqVar = new defpackage.aafq();
        aafqVar.a = new zxc(this, upsertCallingCardRequest, 20);
        aafqVar.b = new com.google.android.gms.common.Feature[]{defpackage.aaqf.y};
        aafqVar.c = 2745;
        return super.i(1, aafqVar.a());
    }
}
