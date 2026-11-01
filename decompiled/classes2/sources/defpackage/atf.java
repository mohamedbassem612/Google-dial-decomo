package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class atf extends aonv implements aonn {
    private final /* synthetic */ int $cid;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atf(java.lang.Object obj, int i, char[] cArr) {
        super(2, obj, afov.class, "fetchAllPhotos", "fetchAllPhotos(I)Lkotlinx/coroutines/Job;", 12);
        this.$cid = i;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            long j = ((defpackage.dpu) obj).a;
            ath athVar = (ath) this.b;
            aoov.an(((apd) athVar).a.f(), (aolr) null, 0, new defpackage.atg(athVar, j, (aoln) null, 2, (char[]) null), 3);
            return aojh.a;
        }
        if (i == 1) {
            long j2 = ((defpackage.dpu) obj).a;
            ath athVar2 = (ath) this.b;
            aoov.an(((apd) athVar2).a.f(), (aolr) null, 0, new defpackage.atg(athVar2, j2, (aoln) null, 0), 3);
            return aojh.a;
        }
        if (i == 2) {
            int iIntValue = ((java.lang.Number) obj).intValue();
            afov afovVar = (afov) this.b;
            aoov.an(afovVar.a, (aolr) null, 0, new defpackage.hxo(afovVar, iIntValue, (aoln) null, 11), 3);
            return aojh.a;
        }
        if (i != 3) {
            int iIntValue2 = ((java.lang.Number) obj).intValue();
            afov afovVar2 = (afov) this.b;
            aoov.an(afovVar2.a, (aolr) null, 0, new defpackage.hxo(afovVar2, iIntValue2, (aoln) null, 12, (byte[]) null), 3);
            return aojh.a;
        }
        int iIntValue3 = ((java.lang.Number) obj).intValue();
        afov afovVar3 = (afov) this.b;
        aoov.an(afovVar3.a, (aolr) null, 0, new defpackage.hxo(afovVar3, iIntValue3, (aoln) null, 13, (char[]) null), 3);
        return aojh.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atf(java.lang.Object obj, int i, byte[] bArr) {
        super(2, obj, ath.class, "onMouseWheelScrollStopped", "onMouseWheelScrollStopped-TH1AsA0(J)V", 4);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atf(java.lang.Object obj, int i) {
        super(2, obj, ath.class, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V", 4);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atf(java.lang.Object obj, int i, int[] iArr) {
        super(2, obj, afov.class, "fetchClusters", "fetchClusters(I)Lkotlinx/coroutines/Job;", 12);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atf(java.lang.Object obj, int i, short[] sArr) {
        super(2, obj, afov.class, "fetchMeClusterPhotos", "fetchMeClusterPhotos(I)Lkotlinx/coroutines/Job;", 12);
        this.$cid = i;
    }
}
