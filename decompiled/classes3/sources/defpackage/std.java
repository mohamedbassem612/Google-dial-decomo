package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class std {
    public final defpackage.stb a = new defpackage.stb(this);
    public boolean b;
    public final android.content.Context c;
    public defpackage.ssu d;

    public std(android.content.Context context) {
        this.c = context;
        this.b = ((android.media.AudioManager) context.getSystemService("audio")).isWiredHeadsetOn();
    }
}
