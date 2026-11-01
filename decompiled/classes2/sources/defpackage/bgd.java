package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bgd implements bfy {
    final /* synthetic */ bfy a;
    final /* synthetic */ bfy b;
    final /* synthetic */ float c;

    public bgd(bfy bfyVar, bfy bfyVar2, float f) {
        this.a = bfyVar;
        this.b = bfyVar2;
        this.c = f;
    }

    public final float a(long j, dpf dpfVar) {
        bfy bfyVar = this.a;
        float f = this.c;
        return ((1.0f - f) * bfyVar.a(j, dpfVar)) + (f * this.b.a(j, dpfVar));
    }
}
