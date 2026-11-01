package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afyz extends defpackage.afzb {
    final /* synthetic */ android.content.Context a;
    final /* synthetic */ android.text.TextPaint b;
    final /* synthetic */ defpackage.afzb c;
    final /* synthetic */ defpackage.afza d;

    public afyz(defpackage.afza afzaVar, android.content.Context context, android.text.TextPaint textPaint, defpackage.afzb afzbVar) {
        this.a = context;
        this.b = textPaint;
        this.c = afzbVar;
        j$.util.Objects.requireNonNull(afzaVar);
        this.d = afzaVar;
    }

    @Override // defpackage.afzb
    public final void a(int i) {
        this.c.a(i);
    }

    @Override // defpackage.afzb
    public final void b(android.graphics.Typeface typeface, boolean z) {
        this.d.e(this.a, this.b, typeface);
        this.c.b(typeface, z);
    }
}
